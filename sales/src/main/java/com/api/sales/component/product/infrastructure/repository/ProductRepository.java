package com.api.sales.component.product.infrastructure.repository;

import com.api.sales.component.product.model.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

}
