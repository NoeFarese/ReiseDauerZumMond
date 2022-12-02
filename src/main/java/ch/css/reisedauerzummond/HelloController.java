package ch.css.reisedauerzummond;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textFieldGeschwindigkeit;

    @FXML
    private TextField textFieldAusgabe;

    @FXML
    private RadioButton radioButtonTage;

    @FXML
    private RadioButton radioButtonStunden;

    @FXML
    private void ButtonLogic(){
        double speedKmh = convertToDouble(textFieldGeschwindigkeit.getText());
        double resultat = 0.0;

        Mondreise mondreise = new Mondreise(speedKmh);

        if (radioButtonTage.isSelected() == true) {
            resultat = mondreise.getTravelDurationDays();
        }
        else {
            resultat = mondreise.getTravelDurationHours();
        }
    }

    private double convertToDouble(String value) {
        try {
            double result = Double.parseDouble(value);

            return result;
        }
        catch(NumberFormatException ex) {
            showExceptionMessageBox("Bitte geben Sie eine Zahl ein");
            return 0;
        }
    }

    private void showExceptionMessageBox(String fehlerAusgabe) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Fehler");
        alert.setHeaderText("Ein Fehler ist aufgetreten.");
        alert.setContentText(fehlerAusgabe);
        alert.showAndWait();
    }

    @FXML
    private void initialize() {
        textFieldGeschwindigkeit.isFocused();
    }
}

