package com.api.sales.util.event;

public interface EventService {

  void emitterMessage(Object eventModel, String queue);
}
