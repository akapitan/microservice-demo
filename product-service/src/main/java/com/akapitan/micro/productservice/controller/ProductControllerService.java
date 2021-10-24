package com.akapitan.micro.productservice.controller;

import com.akapitan.micro.productservice.model.Product;
import com.akapitan.micro.productservice.repository.ProductRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductControllerService {

  private final ProductRepository productRepository;

  public ProductControllerService(
      ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping
  public List<Product> findAll(){
    return productRepository.findAll();
  }

  @PostMapping
  public void createProuct(@RequestBody Product product){
    productRepository.save(product);
  }
}
