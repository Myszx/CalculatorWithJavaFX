package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    Button num_0;

    @FXML
    Button num_1;

    @FXML
    Button num_2;

    @FXML
    Button num_3;

    @FXML
    Button num_4;

    @FXML
    Button num_5;

    @FXML
    Button num_6;

    @FXML
    Button num_7;

    @FXML
    Button num_8;

    @FXML
    Button num_9;

    @FXML
    Label calcArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void clickButton(){
        calcArea.setText(calcArea.getText() + 0);
    }

}
