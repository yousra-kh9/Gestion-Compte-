package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RechercheClient extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Recherche Client");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label clientIDLabel = new Label("Numéro Client:");
        TextField clientIDField = new TextField();

        Button rechercherButton = new Button("Rechercher");

        grid.add(clientIDLabel, 0, 0);
        grid.add(clientIDField, 1, 0);
        grid.add(rechercherButton, 1, 1);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

