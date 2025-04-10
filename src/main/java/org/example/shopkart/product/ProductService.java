package org.example.shopkart.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList;

    public ProductService() {
        productList = new LinkedList<>();
    }

    //CRUD -- create read update delete
    //CREATE
    public Product addProduct(Product product){
        productList.add(product);
        return product;
    }
    //READ

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct(long id){
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);

    }
    //UPDATE
     public Product updatePrice(Product product) {
         productList.stream()
                 .filter(p -> p.getId() == product.getId()
                 )
                 .findFirst()
                 .ifPresent(p -> p.setPrice(
                                 product.getPrice()
                         )
                 );
         return product;
     }

    //DELETE
    public boolean deleteProduct(Product product) {
        productList.remove(product);
        return true;
    }

}


// ctrl + alt + shift +L -- to find mistakes