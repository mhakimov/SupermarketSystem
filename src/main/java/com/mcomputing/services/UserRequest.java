/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcomputing.services;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcomputing.entity.Shift;
import com.mcomputing.entity.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MHakimov
 */
public class UserRequest extends Request {

    public String sendRegisterUserRequest(String json) throws MalformedURLException, IOException {
        url = new URL(serverAddress + "user/register/");
        return sendPostRequest(url, json);
    }

    public User sendLoginRequest(String json) throws MalformedURLException, IOException {
        url = new URL(serverAddress + "user/login/");
        String response = sendPostRequest(url, json);

        if (response.equals("")) {
            return null;
        }
        return convertToUser(response);
    }

    public List<User> sendFindAllUsersRequest() throws MalformedURLException, IOException {
        url = new URL(serverAddress + "user/list/");
        String response = sendGetRequest(url);
        return convertToUsers(response);
    }

    public User convertToUser(String text) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(text, User.class);
        return user;
    }

    public List<User> convertToUsers(String text) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = new ArrayList();
        users = mapper.readValue(text, new TypeReference<List<User>>() {
        });
        return users;
    }
}
