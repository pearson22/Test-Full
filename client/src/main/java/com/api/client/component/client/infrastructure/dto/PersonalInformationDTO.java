package com.api.client.component.client.infrastructure.dto;


import com.api.client.util.enums.documentType.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInformationDTO {

  private String name;
  private String secondName;
  private String lastName;
  private String secondLastName;
  private String fullName;
  private String documentType;
  private String numberDocument;
}
