package com.api.client.util.enums.documentType;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.HashMap;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
@Slf4j
public enum DocumentType {

  VISA("VISA"),
  TARJETA_IDENTIDAD("TARJETA DE IDENTIDAD"),
  PASAPORTE("PASAPORTE"),
  CEDULA("CEDULA");


  private final String name;

  DocumentType(String name) {
    this.name = name;
  }

  private static final HashMap<String, DocumentType> ENUM_MAP_BY_CODE = new HashMap<>();

  static {

    ENUM_MAP_BY_CODE.put(VISA.getName(), VISA);
    ENUM_MAP_BY_CODE.put(TARJETA_IDENTIDAD.getName(), TARJETA_IDENTIDAD);
    ENUM_MAP_BY_CODE.put(PASAPORTE.getName(), PASAPORTE);
    ENUM_MAP_BY_CODE.put(CEDULA.getName(), CEDULA);
  }


  public static DocumentType findById(String id) {
    return ENUM_MAP_BY_CODE.get(id);
  }

}
