package model;

import java.time.LocalDate;

public class Compte {
    private String numeroCompte;
    private String numClient;
    private LocalDate dateCreation;
    private LocalDate dateUpdate;
    private String devise;
    private double solde;

    // Constructeur
    public Compte(String numeroCompte, String numClient, String devise, double solde) {
        this.numeroCompte = numeroCompte;
        this.numClient = numClient;
        this.devise = devise;
        this.solde = solde;
        this.dateCreation = LocalDate.now();
        this.dateUpdate = LocalDate.now();
    }

    
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDate dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public double getSolde() {
        return solde;
    }



    // Méthode pour ajouter un montant
    public void ajouter(double montant) {
        if (montant > 0) {
            this.solde += montant;
            this.dateUpdate = LocalDate.now(); // Mise à jour de la date de modification
            System.out.println(montant + " " + devise + " ajoutés au compte.");
        } else {
            System.out.println("Le montant doit être positif pour un dépôt.");
        }
    }

    // Méthode pour retirer un montant
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            this.solde -= montant;
            this.dateUpdate = LocalDate.now(); 
            System.out.println(montant + " " + devise + " retirés du compte.");
        } else if (montant > solde) {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        } else {
            System.out.println("Le montant doit être positif pour un retrait.");
        }
    }
}

	
	
	
	

