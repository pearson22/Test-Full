package com.api.sales.component.sale.model.service.serviceImpl;

import com.api.sales.component.sale.infrastructure.repository.SaleRepository;
import com.api.sales.component.sale.model.entity.Sale;
import com.api.sales.component.sale.model.service.SaleService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {

  @Autowired
  private SaleRepository repository;

  @Override
  public List<Sale> findAll() {
    return (List<Sale>) repository.findAll();
  }

  @Override
  public Optional<Sale> findById(String id) {
    return repository.findById(id);
  }

  @Override
  public Sale save(Sale client) {
    return repository.save(client);
  }
}
