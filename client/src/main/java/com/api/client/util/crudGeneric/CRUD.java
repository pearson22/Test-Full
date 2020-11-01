package com.api.client.util.crudGeneric;

import java.util.List;

public interface CRUD<T> {

  List<T> findAll();

  T findById(String id);

  T save(T t);
}
