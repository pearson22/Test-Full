package com.api.sales.component.product.infrastructure.facade;

import com.api.sales.component.product.infrastructure.dto.ProductDTO;
import com.api.sales.component.product.model.entity.Product;
import com.api.sales.component.product.model.service.serviceImpl.ProductServiceImpl;
import com.api.sales.util.response.ConstUtil;
import com.api.sales.util.response.ResponseUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceFacadeImpl implements ProductServiceFacade {

  @Autowired
  private ProductServiceImpl service;

  ObjectMapper objectMapper = new ObjectMapper();
  ResponseUtil responseUtil = new ResponseUtil();

  @Override
  public ResponseUtil findAll() {
    try {
      responseUtil.setMessage("");
      responseUtil.setType(ConstUtil.CODE_OK);
      responseUtil.setObjectResponse(service.findAll());

      return responseUtil;
    } catch (Exception ex) {

      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ProductServiceFacadeImpl.class.getName());

    }

    return responseUtil;
  }

  @Override
  public ResponseUtil findById(String id) {
    try {
      responseUtil.setMessage("");
      responseUtil.setType(ConstUtil.CODE_OK);
      responseUtil.setObjectResponse(service.findById(id).get());

      return responseUtil;
    } catch (Exception ex) {

      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ProductServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }


  @Override
  public ResponseUtil save(ProductDTO productDTO) {
    try {
      responseUtil.setMessage(ConstUtil.MSG_EXITO);
      responseUtil.setType(ConstUtil.CODE_OK);


      Product product = service.save(objectMapper.convertValue(productDTO, Product.class));

      responseUtil.setObjectResponse(product);
      return responseUtil;
    } catch (Exception ex) {
      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(ProductServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }


}
