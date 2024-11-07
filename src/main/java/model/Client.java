package model;

public class Client {
 private String numclient;
 private String nom;
 private String prenom;
 private String adresse;
 private String phone;
 private String email; 
  
 public Client(String numclient, String nom, String prenom, String adresse, String phone, String email) {
	 this.numclient = numclient;
     this.nom = nom;
     this.prenom = prenom;
     this.adresse = adresse;
     this.phone = phone;
     this.email = email;
 }

public String getNumclient() {
	return numclient;
}

public void setNumclient(String numclient) {
	this.numclient = numclient;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}
