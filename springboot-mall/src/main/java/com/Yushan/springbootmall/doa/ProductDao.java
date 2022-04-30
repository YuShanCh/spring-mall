package com.Yushan.springbootmall.doa;

import com.Yushan.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
