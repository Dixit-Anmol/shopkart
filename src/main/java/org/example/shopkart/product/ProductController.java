package org.example.shopkart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST representational state transfer
//JSON JavaScript Object Notation
@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //CRUD

    //CREATE - POST
    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return product;
    }

    //READ - GET
    @GetMapping("/products")
    public List<Product> getProductList(){
        return productService.getProductList();
    }
    //READ get
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable long id){
        return productService.getProduct(id);
    }

    //UPDATE - PUT

    //DELETE - DELETE

    //REQUEST - HTTP METHOD & URL
    //HTTP - STATUS & RESPONSE BODY
}
