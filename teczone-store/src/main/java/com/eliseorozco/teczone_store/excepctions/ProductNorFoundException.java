package com.eliseorozco.teczone_store.excepctions;

public class ProductNorFoundException extends RuntimeException{
    public ProductNorFoundException (String message) {
        super(message);
    }
}
