package com.api.sales.component.product.infrastructure.controller;

import com.api.sales.component.product.infrastructure.dto.ProductDTO;
import com.api.sales.component.product.infrastructure.facade.ProductServiceFacadeImpl;
import com.api.sales.util.response.ResponseUtil;
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
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

  @Autowired
  private ProductServiceFacadeImpl serviceFacade;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseUtil saveSucursal(@RequestBody @Valid ProductDTO productDTO) {
    return serviceFacade.save(productDTO);
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
