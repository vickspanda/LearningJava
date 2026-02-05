package com.panda.DemoWeb.service;

import com.panda.DemoWeb.model.Product;
import com.panda.DemoWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",150000),
//            new Product(102,"Samsung",30000),
//            new Product(103,"Redmi",12000)) );

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){return repo.findById(prodId).orElse(new Product());}

    public void addProduct(Product prod){repo.save(prod);}

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}
