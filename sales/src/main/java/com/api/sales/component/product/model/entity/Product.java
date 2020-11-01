package com.api.sales.component.product.model.entity;

import com.api.sales.util.baseEntity.BaseEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseEntity implements Serializable {

  private String name;
  private BigDecimal value;
}
