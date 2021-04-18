/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author MHakimov
 */
public class Product {

    @JsonProperty("productId")
    private Long productId;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("productQuantity")
    private Long productQuantity;

    @JsonProperty("productPrice")
    private Double productPrice;

    @JsonProperty("productCategory")
    private String productCategory;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
    
}
