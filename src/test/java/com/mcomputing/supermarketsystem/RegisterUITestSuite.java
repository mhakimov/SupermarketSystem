/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.supermarketsystem;

import org.junit.Test;


/**
 *
 * @author MHakimov
 */

public class RegisterUITestSuite {
    
  //TODO
  @Test
  public void verifyUSerRegistration(){
//      - user enters valid details where passwords match;
//      - user clicks Register button;
//      Expected result: A pop message with new user details appears
  }
    
  //TODO
  @Test
  public void verifyPasswordsThatDoNotMatch(){
//      - user enters username and 2 passwords that have different values;
//      - user clicks Sign in button;
//      Expected result: Error pop-up message
  }
  
  //TODO
  @Test
  public void verifyRegisteringExistingUser(){
//      - user enters username of an existent user and 2 matching password;
//      - user clicks Sign In button;
//      Expected result: Error pop-up message
  }
  
   //TODO
  @Test
  public void verifyMissingFieldsMessage(){
//      - user leaves at least one test field blank;
//      - user clicks Sign In button
//      Expected result: Error pop-up message;
  }
}
