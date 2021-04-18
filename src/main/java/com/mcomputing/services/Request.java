/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/**
 *
 * @author MHakimov
 */
public class Request {

    URL url;
    HttpURLConnection con;
    protected String serverAddress = "http://localhost:9191/";

    public String sendPostRequest(URL url, String json) throws IOException {
        con = (HttpURLConnection) url.openConnection();
        setConnection(con, "POST");

        try (OutputStream os = con.getOutputStream()) {
            byte[] input = json.getBytes("utf-8");
            os.write(input, 0, input.length);
            System.out.println("executing sendRequest!!!");
        }

        return getResponse(con);
    }

    public String sendGetRequest(URL url) throws IOException {
        con = (HttpURLConnection) url.openConnection();
        setConnection(con, "GET");

        return getResponse(con);
    }
    
      public String sendDeleteRequest(URL url) throws IOException {
        con = (HttpURLConnection) url.openConnection();
        setConnection(con, "DELETE");
        return getResponse(con);
    }
    
    public void setConnection(HttpURLConnection con, String rest) throws ProtocolException{          
        con.setRequestMethod(rest);
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
    }
    
    public String getResponse(HttpURLConnection con) throws IOException{
         try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
            return response.toString();
        }
    }
}
