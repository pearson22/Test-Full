package com.api.sales.util.crudGeneric;

import com.api.sales.util.response.ResponseUtil;

public interface CRUDDTO<T> {

  ResponseUtil findAll();

  ResponseUtil findById(String id);

  ResponseUtil save(T t);
}
