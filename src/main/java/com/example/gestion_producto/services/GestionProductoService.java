package com.example.gestion_producto.services;

import com.example.gestion_producto.models.Product;
import com.example.gestion_producto.repositories.GestionProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionProductoService {

    @Autowired
    private GestionProductoRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Product eliminado correctamente!";
    }
}