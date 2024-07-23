package com.usman.myWebApp.service;

import com.usman.myWebApp.model.Product;
import com.usman.myWebApp.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102, "Samsung",20000),
//            new Product(103, "Rode Mic",30000)
//    ));

    public List<Product> getProducts() {
        return repo.findAll() ;
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);

    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
