package com.eliseorozco.teczone_store.service.product;

import com.eliseorozco.teczone_store.excepctions.ProductNorFoundException;
import com.eliseorozco.teczone_store.model.Product;
import com.eliseorozco.teczone_store.repository.ProductRespository;

import java.util.List;

public class ProductService implements IProductService{

    private ProductRespository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()-> new ProductNorFoundException("Product not found"));
    }

    @Override
    public void updateProductById(Product product, Long productId) {

    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndCategory(String brand, String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }
}
