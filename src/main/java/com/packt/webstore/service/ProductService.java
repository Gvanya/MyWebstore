package com.packt.webstore.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(String productID);

    List<Product> getProductsByCategory(String category);

    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    List<Product> getProductsByManufacturer (String manufacturer);

    List<Product> getProductsByPrice(BigDecimal low, BigDecimal high);

    void addProduct(Product product);
}
