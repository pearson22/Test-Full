package com.api.sales.component.client.infrastructure.dto;

import com.api.sales.util.baseEntity.BaseEntityDTO;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO extends BaseEntityDTO implements Serializable {

  private String fullName;
  private String numberDocument;
  private String email;
}
