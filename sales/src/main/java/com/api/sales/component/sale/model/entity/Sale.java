package com.api.sales.component.sale.model.entity;

import com.api.sales.component.client.model.entity.Client;
import com.api.sales.component.product.model.entity.Product;
import com.api.sales.util.baseEntity.BaseEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sale extends BaseEntity implements Serializable {

  @ManyToOne
  private Product product;
  @ManyToOne
  private Client client;
}
