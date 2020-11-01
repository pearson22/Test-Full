package com.api.client.util.crudGeneric;

import com.api.client.util.response.ResponseUtil;

public interface CRUDDTO<T> {

  ResponseUtil findAll();

  ResponseUtil findById(String id);

  ResponseUtil save(T t);
}
