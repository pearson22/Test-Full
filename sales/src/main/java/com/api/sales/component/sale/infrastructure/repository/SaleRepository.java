package com.api.sales.component.sale.infrastructure.repository;

import com.api.sales.component.sale.model.entity.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends CrudRepository<Sale, String> {

}
