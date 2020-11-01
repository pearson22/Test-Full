package com.api.sales.component.product.model.service.serviceImpl;

import com.api.sales.component.product.infrastructure.repository.ProductRepository;
import com.api.sales.component.product.model.entity.Product;
import com.api.sales.component.product.model.service.ProductService;
import com.api.sales.component.sale.infrastructure.repository.SaleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository repository;

  @Override
  public List<Product> findAll() {
    return (List<Product>) repository.findAll();
  }

  @Override
  public Optional<Product> findById(String id) {
    return repository.findById(id);
  }

  @Override
  public Product save(Product client) {
    return repository.save(client);
  }
}
