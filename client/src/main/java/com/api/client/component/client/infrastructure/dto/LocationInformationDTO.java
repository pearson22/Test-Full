package com.api.client.component.client.infrastructure.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationInformationDTO {

  private String address;
  private String email;
  private String phone;
  private String cell;

}
