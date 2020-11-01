package com.api.client.util.baseEntity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntityDTO implements Serializable {

  private String id;
  private Date creationDate;
  private Date updateDate;
}
