package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AjoutClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ajout Client");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label numClientLabel = new Label("Numéro Client:");
        TextField numClientField = new TextField();
        Label nomLabel = new Label("Nom:");
        TextField nomField = new TextField();
        Label prenomLabel = new Label("Prénom:");
        TextField prenomField = new TextField();
        Label adresseLabel = new Label("Adresse:");
        TextField adresseField = new TextField();
        Label phoneLabel = new Label("Téléphone:");
        TextField phoneField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button ajouterButton = new Button("Ajouter Client");

        grid.add(numClientLabel, 0, 0);
        grid.add(numClientField, 1, 0);
        grid.add(nomLabel, 0, 1);
        grid.add(nomField, 1, 1);
        grid.add(prenomLabel, 0, 2);
        grid.add(prenomField, 1, 2);
        grid.add(adresseLabel, 0, 3);
        grid.add(adresseField, 1, 3);
        grid.add(phoneLabel, 0, 4);
        grid.add(phoneField, 1, 4);
        grid.add(emailLabel, 0, 5);
        grid.add(emailField, 1, 5);
        grid.add(ajouterButton, 1, 6);

        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

