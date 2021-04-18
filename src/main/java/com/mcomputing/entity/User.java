/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Valera
 */
public class User {
    @JsonProperty("userId")
    private Long userId;
    
    @JsonProperty("userName")
    private String userName;
    
    @JsonProperty("userPassword")
    private String userPassword;
    
    @JsonProperty("userAdmin")
    private boolean userAdmin;
    
    @JsonProperty("userManager")
    private boolean userManager;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    
     public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isUserAdmin() {
        return userAdmin;
    }
    
     public void setUserAdmin(boolean userAdmin) {
        this.userAdmin = userAdmin;
    }

    public boolean isUserManager() {
        return userManager;
    }

    public void setUserManager(boolean userManager) {
        this.userManager = userManager;
    }
    
    
    

    
   
    
    
}
