package com.api.sales.component.sale.infrastructure.dto;

import com.api.sales.component.client.infrastructure.dto.ClientDTO;
import com.api.sales.component.product.infrastructure.dto.ProductDTO;
import com.api.sales.util.baseEntity.BaseEntityDTO;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO extends BaseEntityDTO implements Serializable {

  private ProductDTO product;
  private ClientDTO client;

}
