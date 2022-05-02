package com.Yushan.springbootmall.service;

import com.Yushan.springbootmall.dto.ProductRequest;
import com.Yushan.springbootmall.model.Product;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
