package model;

import java.time.LocalDateTime;

public class Transaction {
   
    public enum TypeTransaction {
        VIRINI,   
        VIREST,   
        VIRMULTA, 
        VIRCHAC   
    }

    private TypeTransaction type;
    private LocalDateTime timesetup;
    private String reference;
    private double montant;

    // Constructeur
    public Transaction(TypeTransaction type, String reference, double montant) {
        this.type = type;
        this.reference = reference;
        this.montant = montant;
        this.timesetup = LocalDateTime.now(); // Date et heure de création de la transaction
    }

    
    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }

    public LocalDateTime getTimesetup() {
        return timesetup;
    }

    public void setTimesetup(LocalDateTime timesetup) {
        this.timesetup = timesetup;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
