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
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        () -> {throw new ProductNorFoundException("Product not found");});
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrandAndCategory(String brand, String category) {
        return productRepository.findByBrandAndCategoryName(brand,category);
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return productRepository.findByBrandAndName(brand,name);
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return productRepository.countByBrandAndName(brand,name);
    }
}
