package com.api.client.component.client.infrastructure.dto;

import com.api.client.util.baseEntity.BaseEntityDTO;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO extends BaseEntityDTO implements Serializable {

  private PersonalInformationDTO personalInformation;

  private LocationInformationDTO locationInformation;
}
