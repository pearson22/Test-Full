package com.api.client.component.client.infrastructure.controller;

import com.api.client.component.client.infrastructure.dto.ClientDTO;
import com.api.client.component.client.infrastructure.facade.ClientServiceFacade;
import com.api.client.component.client.infrastructure.facade.ClientServiceFacadeImpl;
import com.api.client.util.response.ResponseUtil;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

  @Autowired
  private ClientServiceFacade serviceFacade;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseUtil saveSucursal(@RequestBody @Valid ClientDTO clientDTO) {
    return serviceFacade.save(clientDTO);
  }

  @GetMapping("{id}")
  public ResponseUtil findById(@PathVariable String id) {
    return serviceFacade.findById(id);
  }

  @GetMapping
  public ResponseUtil findAll() {
    return serviceFacade.findAll();
  }




}
