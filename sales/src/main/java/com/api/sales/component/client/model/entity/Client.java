package com.api.sales.component.client.model.entity;

import com.api.sales.util.baseEntity.BaseEntity;
import java.io.Serializable;
import javax.persistence.Embedded;
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
public class Client extends BaseEntity implements Serializable {

  private String fullName;
  private String numberDocument;
  private String email;
}
