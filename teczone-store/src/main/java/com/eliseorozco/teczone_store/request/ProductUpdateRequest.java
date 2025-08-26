package com.eliseorozco.teczone_store.request;

import com.eliseorozco.teczone_store.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private BigDecimal price;
    private String brand;
    private String description;
    private int inventory;
    private Category category;
}
