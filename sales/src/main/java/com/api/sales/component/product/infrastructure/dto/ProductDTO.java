package com.api.sales.component.product.infrastructure.dto;

import com.api.sales.component.client.infrastructure.dto.ClientDTO;
import com.api.sales.util.baseEntity.BaseEntityDTO;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO extends BaseEntityDTO implements Serializable {

  private String name;
  private BigDecimal value;

}
