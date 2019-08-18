package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getProduct() {
        return productDao.getProduct();
    }


}
