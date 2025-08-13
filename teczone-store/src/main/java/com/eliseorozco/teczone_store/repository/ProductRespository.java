package com.eliseorozco.teczone_store.repository;

import com.eliseorozco.teczone_store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,Long> {
}
