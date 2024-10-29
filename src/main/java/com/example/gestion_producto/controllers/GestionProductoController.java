package com.example.gestion_producto.controllers;



import com.example.gestion_producto.models.Product;
import com.example.gestion_producto.services.GestionProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage/products")
public class GestionProductoController {

    @Autowired
    private GestionProductoService productManagementService;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productManagementService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productManagementService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return productManagementService.deleteProduct(id);
    }
}