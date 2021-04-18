/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcomputing.entity.Product;
import com.mcomputing.entity.User;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MHakimov
 */
public class ProductRequest extends Request {
    
      public String sendAddProductRequest(String json) throws MalformedURLException, IOException {
        url = new URL(serverAddress + "product/add/");
        return sendPostRequest(url, json);
    }
      
      public String sendEditProductRequest(String json) throws MalformedURLException, IOException {
        url = new URL(serverAddress + "product/update/");
        return sendPostRequest(url, json);
    }
      
      public List<Product> sendFindAllProductsRequest() throws MalformedURLException, IOException {
        url = new URL(serverAddress + "product/list/"); 
        String response = sendGetRequest(url);
        return convertToProducts(response);
      }
      
      public String sendDeleteProductRequest(String productId) throws MalformedURLException, IOException {
          url = new URL(serverAddress + "product/delete/"+productId);
        return sendDeleteRequest(url);
      }
      
      public List<Product> convertToProducts(String text) throws IOException {
        System.out.println("executing convertToProducts()");
        ObjectMapper mapper = new ObjectMapper();
        List<Product> products = new ArrayList();
        products = mapper.readValue(text, new TypeReference<List<Product>>(){});
        return products;
    }

   
      

}
