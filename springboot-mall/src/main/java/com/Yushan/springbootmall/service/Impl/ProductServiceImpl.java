package com.Yushan.springbootmall.service.Impl;

import com.Yushan.springbootmall.doa.ProductDao;
import com.Yushan.springbootmall.dto.ProductRequest;
import com.Yushan.springbootmall.model.Product;
import com.Yushan.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
