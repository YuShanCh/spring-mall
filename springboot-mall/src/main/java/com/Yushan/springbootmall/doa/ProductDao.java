package com.Yushan.springbootmall.doa;

import com.Yushan.springbootmall.dto.ProductRequest;
import com.Yushan.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
