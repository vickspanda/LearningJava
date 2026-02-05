package com.panda.DemoWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
