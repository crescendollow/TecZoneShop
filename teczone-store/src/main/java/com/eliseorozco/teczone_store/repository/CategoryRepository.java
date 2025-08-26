package com.eliseorozco.teczone_store.repository;

import com.eliseorozco.teczone_store.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
}
