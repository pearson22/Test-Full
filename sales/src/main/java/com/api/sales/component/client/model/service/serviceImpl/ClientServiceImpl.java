package com.api.sales.component.client.model.service.serviceImpl;

import com.api.sales.component.client.infrastructure.repository.ClientRepository;
import com.api.sales.component.client.model.entity.Client;
import com.api.sales.component.client.model.service.ClientService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientRepository repository;

  @Override
  public List<Client> findAll() {
    return (List<Client>) repository.findAll();
  }

  @Override
  public Optional<Client> findById(String id) {
    return repository.findById(id);
  }

  @Override
  public Client save(Client client) {
    return repository.save(client);
  }
}
