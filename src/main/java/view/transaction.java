package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class transaction extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Transaction");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label typeLabel = new Label("Type de Transaction:");
        ComboBox<String> typeComboBox = new ComboBox<>();
        typeComboBox.getItems().addAll("VIRINI", "VIREST", "VIRMULTA", "VIRCHAC");

        Label referenceLabel = new Label("Référence:");
        TextField referenceField = new TextField();
        Label montantLabel = new Label("Montant:");
        TextField montantField = new TextField();

        Button effectuerButton = new Button("Effectuer Transaction");

        grid.add(typeLabel, 0, 0);
        grid.add(typeComboBox, 1, 0);
        grid.add(referenceLabel, 0, 1);
        grid.add(referenceField, 1, 1);
        grid.add(montantLabel, 0, 2);
        grid.add(montantField, 1, 2);
        grid.add(effectuerButton, 1, 3);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
