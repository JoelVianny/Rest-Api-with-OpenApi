package com.example.sprint_boot_with_open_api.service;

import com.example.sprint_boot_with_open_api.entities.Product;
import com.example.sprint_boot_with_open_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product>  getALlProduct(){
        return   productRepository.findAll();
    }

    public Product getProductById(long id){
        return productRepository.findById(id).orElseThrow( ()-> new IllegalArgumentException("not found"));
    }

    public Product addProduct(Product product){
        return  productRepository.save(product);

    }

    public Product editProduct(Product product ,long id){
         Product foundProduct = getProductById(id);
          foundProduct.setName(product.getName());
          foundProduct.setCategory(product.getCategory());
          foundProduct.setPrice(product.getPrice());
          foundProduct.setQuantity(product.getQuantity());

          return productRepository.save(foundProduct);
    }

    public  String deleteProduct(long id){

        productRepository.deleteById(id);

        return  "Product has deleted";
    }

}
