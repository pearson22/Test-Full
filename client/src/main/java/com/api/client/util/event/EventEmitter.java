package com.api.client.util.event;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class EventEmitter implements EventService {

  ObjectMapper Obj = new ObjectMapper();

  @Autowired
  private JmsTemplate jmsTemplate;


  @Override
  public void emitterMessage(Object eventModel, String queue) {
    try {
      String jsonStr = Obj.writeValueAsString(eventModel);
      jmsTemplate.convertAndSend(queue, jsonStr);
      log.info("### Message Successfully Pushed into Queue ###");

    } catch (JsonProcessingException e) {
      log.info(e.getMessage());
    }
  }

}
