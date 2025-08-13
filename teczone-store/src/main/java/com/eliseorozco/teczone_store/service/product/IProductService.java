package com.eliseorozco.teczone_store.service.product;

import com.eliseorozco.teczone_store.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);

    Product getProductById(Long id);
    void updateProductById(Product product, Long productId);
    void deleteProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrandAndCategory(String brand, String category);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

}
