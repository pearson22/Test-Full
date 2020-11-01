package com.api.sales.component.client.infrastructure.repository;

import com.api.sales.component.client.model.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {

}
