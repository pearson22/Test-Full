package com.api.client.component.client.model.entity;

import javax.persistence.Column;
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
public class PersonalInformation {


  private String name;
  private String secondName;
  private String lastName;
  private String secondLastName;
  private String fullName;
  private String documentType;
  @Column(unique = true)
  private String numberDocument;
}
