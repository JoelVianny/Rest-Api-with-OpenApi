package com.example.sprint_boot_with_open_api.repository;

import com.example.sprint_boot_with_open_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product , Long> {
}
