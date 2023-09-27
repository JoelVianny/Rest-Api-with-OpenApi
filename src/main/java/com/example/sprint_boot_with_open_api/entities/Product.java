package com.example.sprint_boot_with_open_api.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "product")
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private String category;
    private int price;
    private int quantity;

}
