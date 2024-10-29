package com.example.gestion_producto.repositories;


import com.example.gestion_producto.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionProductoRepository extends JpaRepository<Product, Long> {
}
