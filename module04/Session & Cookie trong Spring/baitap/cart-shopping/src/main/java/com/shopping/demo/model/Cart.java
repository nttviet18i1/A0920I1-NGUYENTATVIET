package com.shopping.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Cart {

    private Long idCart;

    private Product product;

    private int quantity=(1);

    public Cart() {
    }

    public Cart(Long idCart , Product product , int quantity) {
        this.idCart = idCart;
        this.product = product;
        this.quantity = quantity;
    }

    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
