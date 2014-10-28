package com.sony.registration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.registration.domain.Product;
import com.sony.registration.domain.repository.ProductRepository;
import com.sony.registration.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

  @Autowired
  private ProductRepository productRepository;
  
  public void processOrder(String productId, long quantity) {
    Product productById = productRepository.getProductById(productId);
    
    if(productById.getUnitsInStock() < quantity){
      throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
    }
    
    productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
  }
}
