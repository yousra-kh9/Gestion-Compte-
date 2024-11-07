package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreationCompte extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Création Compte");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label numeroCompteLabel = new Label("Numéro Compte:");
        TextField numeroCompteField = new TextField();
        Label numClientLabel = new Label("Numéro Client:");
        TextField numClientField = new TextField();
        Label deviseLabel = new Label("Devise:");
        TextField deviseField = new TextField();
        Label soldeLabel = new Label("Solde Initial:");
        TextField soldeField = new TextField();

        Button creerButton = new Button("Créer Compte");

        grid.add(numeroCompteLabel, 0, 0);
        grid.add(numeroCompteField, 1, 0);
        grid.add(numClientLabel, 0, 1);
        grid.add(numClientField, 1, 1);
        grid.add(deviseLabel, 0, 2);
        grid.add(deviseField, 1, 2);
        grid.add(soldeLabel, 0, 3);
        grid.add(soldeField, 1, 3);
        grid.add(creerButton, 1, 4);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

