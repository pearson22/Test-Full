package com.api.sales.util.crudGeneric;

import java.util.List;
import java.util.Optional;

public interface CRUD<T> {

  List<T> findAll();

  Optional<T> findById(String id);

  T save(T t);
}
