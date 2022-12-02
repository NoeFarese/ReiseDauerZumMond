package ch.css.reisedauerzummond;

import javafx.fxml.FXML;
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
        double speedKmh = convertToInt64(textFieldGeschwindigkeit.getText());
        double result = 0.0;

        Mondreise mondreise = new Mondreise(speedKmh);

        if (radioButtonTage.isSelected() == true) {
            result = mondreise.getTravelDurationDays();
        }
        else {
            result = mondreise.getTravelDurationHours();
        }
    }
}

