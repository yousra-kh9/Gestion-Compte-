package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RechercheCompte extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Recherche Compte");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label compteIDLabel = new Label("Numéro Compte:");
        TextField compteIDField = new TextField();

        Button rechercherButton = new Button("Rechercher");

        grid.add(compteIDLabel, 0, 0);
        grid.add(compteIDField, 1, 0);
        grid.add(rechercherButton, 1, 1);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

