package com.api.sales.event;

import com.api.sales.component.client.model.entity.Client;
import com.api.sales.component.client.model.service.ClientService;
import com.api.sales.util.event.EventModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClientEventListener {

  @Autowired
  private ClientService service;

  private ObjectMapper mapper = new ObjectMapper();

  @JmsListener(destination = "ClientQueue")
  public void listener(String jsonInString) {
    try {

      EventModel eventModel = mapper.readValue(jsonInString, EventModel.class);
      actions(eventModel);

      log.info("Message received {} ");

    } catch (IOException e) {
      log.error(e.getMessage());
    }
  }

  private void actions(EventModel eventModel) {
    switch (eventModel.getAction()) {
      case "save":
        try {
          String clientJson = new ObjectMapper().writeValueAsString(eventModel.getObject());

          Client client = mapper.readValue(clientJson, Client.class);

          service.save(client);
        } catch (Exception e) {

          log.error(e.getMessage());
        }
        break;

      default:
        // code block
    }
  }

}
