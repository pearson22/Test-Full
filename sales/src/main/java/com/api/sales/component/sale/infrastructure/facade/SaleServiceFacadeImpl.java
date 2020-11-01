package com.api.sales.component.sale.infrastructure.facade;

import com.api.sales.component.client.infrastructure.dto.ClientDTO;
import com.api.sales.component.client.model.entity.Client;
import com.api.sales.component.client.model.service.ClientService;
import com.api.sales.component.product.infrastructure.dto.ProductDTO;
import com.api.sales.component.product.model.entity.Product;
import com.api.sales.component.product.model.service.ProductService;
import com.api.sales.component.sale.infrastructure.dto.SaleDTO;
import com.api.sales.component.sale.model.entity.Sale;
import com.api.sales.component.sale.model.service.SaleService;
import com.api.sales.util.response.ConstUtil;
import com.api.sales.util.response.ResponseUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaleServiceFacadeImpl implements SaleServiceFacade {

  @Autowired
  private SaleService service;
  @Autowired
  private ClientService clientService;
  @Autowired
  private ProductService productService;

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
      log.error(SaleServiceFacadeImpl.class.getName());

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
      log.error(SaleServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }


  @Override
  public ResponseUtil save(SaleDTO saleDTO) {
    try {
      responseUtil.setMessage(ConstUtil.MSG_EXITO);
      responseUtil.setType(ConstUtil.CODE_OK);



      Sale sale = service.save(objectMapper.convertValue(setValue(saleDTO), Sale.class));

      responseUtil.setObjectResponse(sale);
      return responseUtil;
    } catch (Exception ex) {
      responseUtil.setMessage(ex.getMessage());
      responseUtil.setType(ConstUtil.CODE_ERROR);
      log.error(SaleServiceFacadeImpl.class.getName());
    }

    return responseUtil;
  }

  private SaleDTO setValue(SaleDTO saleDTO) {

    Client client = clientService.findById(saleDTO.getClient().getId()).get();
    Product product = productService.findById(saleDTO.getProduct().getId()).get();

    saleDTO.setClient(objectMapper.convertValue(client, ClientDTO.class));
    saleDTO.setProduct(objectMapper.convertValue(product, ProductDTO.class));

    return saleDTO;
  }


}
