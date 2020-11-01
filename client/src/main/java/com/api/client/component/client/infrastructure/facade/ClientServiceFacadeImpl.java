package com.api.client.component.client.infrastructure.facade;

import com.api.client.component.client.infrastructure.dto.ClientDTO;
import com.api.client.component.client.model.entity.Client;
import com.api.client.component.client.model.service.ClientService;
import com.api.client.util.enums.documentType.DocumentType;
import com.api.client.util.event.EventModel;
import com.api.client.util.event.EventService;
import com.api.client.util.response.ConstUtil;
import com.api.client.util.response.ResponseUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientServiceFacadeImpl implements ClientServiceFacade {

  @Autowired
  private ClientService service;

  @Autowired
  private EventService jmsService;

  ObjectMapper objectMapper = new ObjectMapper();
  ResponseUtil responseUtil = new ResponseUtil();

  @Override
  public ResponseUtil findAll() {
    try {
      responseUtil.setMessage("");
      responseUtil.setType(ConstUtil.CODE_OK);
      responseUtil.setObjectResponse(service.findAll());

      return responseUtil;
    } catch (Exception ex) {

      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ClientServiceFacadeImpl.class.getName());

    }

    return responseUtil;
  }

  @Override
  public ResponseUtil findById(String id) {
    try {
      responseUtil.setMessage("");
      responseUtil.setType(ConstUtil.CODE_OK);
      responseUtil.setObjectResponse(service.findById(id));

      return responseUtil;
    } catch (Exception ex) {

      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ClientServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }

  @Override
  public ResponseUtil save(ClientDTO clientDTO) {
    try {
      responseUtil.setMessage(ConstUtil.MSG_EXITO);
      responseUtil.setType(ConstUtil.CODE_OK);

      clientDTO.getPersonalInformation().setFullName(setFullName(clientDTO));

      Client client = service.save(objectMapper.convertValue(clientDTO, Client.class));

      responseUtil.setObjectResponse(client);
      sendEvent(client, "save");
      return responseUtil;
    } catch (Exception ex) {
      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ClientServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }

  private String setFullName(ClientDTO clientDTO) {

    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append(clientDTO.getPersonalInformation().getName());
    stringBuilder.append(" ");
    if (Optional.ofNullable(clientDTO.getPersonalInformation().getLastName()).isPresent()) {

      stringBuilder.append(clientDTO.getPersonalInformation().getLastName());
      stringBuilder.append(" ");

    }
    stringBuilder.append(clientDTO.getPersonalInformation().getSecondLastName());

    return stringBuilder.toString();
  }

  private void sendEvent(Client client, String action) {

    jmsService.emitterMessage(createEvent(client,action), "ClientQueue");
  }

  private EventModel createEvent(Client client,String action){
    Map<String, String> data = new HashMap<>();
    data.put("id", client.getId());
    data.put("creationDate","");
    data.put("updateDate", "");
    data.put("fullName", client.getPersonalInformation().getFullName());
    data.put("numberDocument", client.getPersonalInformation().getNumberDocument());
    data.put("email", client.getLocationInformation().getEmail());

    return EventModel.builder()
        .action(action)
        .object(data)
        .build();

  }
}
