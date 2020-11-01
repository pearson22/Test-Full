package com.api.client.component.client.model.entity;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationInformation {

  private String address;
  private String email;
  private String phone;
  private String cell;

}
