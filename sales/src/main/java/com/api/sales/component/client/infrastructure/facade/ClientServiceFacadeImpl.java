package com.api.sales.component.client.infrastructure.facade;

import com.api.sales.component.client.infrastructure.dto.ClientDTO;
import com.api.sales.component.client.model.entity.Client;
import com.api.sales.component.client.model.service.serviceImpl.ClientServiceImpl;
import com.api.sales.util.response.ConstUtil;
import com.api.sales.util.response.ResponseUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientServiceFacadeImpl implements ClientServiceFacade {

  @Autowired
  private ClientServiceImpl service;

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


      Client client = service.save(objectMapper.convertValue(clientDTO, Client.class));

      responseUtil.setObjectResponse(client);
      return responseUtil;
    } catch (Exception ex) {
      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ClientServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }
}
