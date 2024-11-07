package service;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Client;


public class ClientJsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Méthode de conversion du client en JSON
    public static String toJson(Client client) throws Exception {
        return objectMapper.writeValueAsString(client);
    }

    // Méthode de conversion du JSON en client
    public static Client fromJson(String json) throws Exception {
        return objectMapper.readValue(json, Client.class);
    }
}
