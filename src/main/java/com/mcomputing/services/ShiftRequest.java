/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mcomputing.entity.Shift;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MHakimov
 */
public class ShiftRequest extends Request {
    
      public String sendAddShiftRequest(String json) throws MalformedURLException, IOException {
        url = new URL(serverAddress + "shift/add/");
        return sendPostRequest(url, json);
    }
      
      public String sendEditShiftRequest(String json) throws MalformedURLException, IOException {
        url = new URL(serverAddress + "shift/update/");
        return sendPostRequest(url, json);
    }
      
      public List<Shift> sendFindAllShiftsRequest() throws MalformedURLException, IOException {
        url = new URL(serverAddress + "shift/list/"); 
        String response = sendGetRequest(url);
        return convertToShifts(response);
      }
      
      public String sendDeleteShiftRequest(String productId) throws MalformedURLException, IOException {
          url = new URL(serverAddress + "shift/delete/"+productId);
        return sendDeleteRequest(url);
      }
      
      public List<Shift> convertToShifts(String text) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Shift> shifts = new ArrayList();
        shifts = mapper.readValue(text, new TypeReference<List<Shift>>(){});
        return shifts;
    }

   
      

}
