package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Transaction;

public class TransactionJsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Méthode de conversion de la transaction en JSON
    public static String toJson(Transaction transaction) throws Exception {
        return objectMapper.writeValueAsString(transaction);
    }

    // Méthode de conversion du JSON en transaction
    public static Transaction fromJson(String json) throws Exception {
        return objectMapper.readValue(json, Transaction.class);
    }
}
