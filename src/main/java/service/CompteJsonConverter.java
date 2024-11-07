package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Compte;

public class CompteJsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Méthode de conversion du compte en JSON
    public static String toJson(Compte compte) throws Exception {
        return objectMapper.writeValueAsString(compte);
    }

    // Méthode de conversion du JSON en compte
    public static Compte fromJson(String json) throws Exception {
        return objectMapper.readValue(json, Compte.class);
    }
}