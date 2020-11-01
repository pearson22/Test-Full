package com.api.client.util.event;

public interface EventService {

  void emitterMessage(Object eventModel, String queue);
}
