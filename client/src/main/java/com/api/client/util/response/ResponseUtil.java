package com.api.client.util.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class ResponseUtil {

  private String message;
  private String exceptionMessage;
  private Integer type;
  private String code;
  private Object objectResponse;
}
