package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Product {

    private int id;

    private String name;

    private double price;

    private Date creationdate;
}
