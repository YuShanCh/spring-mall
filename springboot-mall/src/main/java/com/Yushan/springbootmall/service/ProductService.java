package com.Yushan.springbootmall.service;

import com.Yushan.springbootmall.dto.ProductRequest;
import com.Yushan.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
