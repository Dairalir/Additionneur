package com.example.additionneur.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AdditionneurController {
    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button clear;
    public Button Calculate;
    public TextArea TextArea;


    int res = 0;

    public void Button_Calculate(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        if (TextArea.getText().equals("")) {
            TextArea.appendText(" " + btn.getText());
        } else {
            TextArea.appendText(" + " + btn.getText());
        }
        res += Integer.parseInt(btn.getText());
    }
    public void Button_clear(ActionEvent actionEvent) {
        res = 0;
        TextArea.clear();
    }

    @FXML
    public void Button_Result(ActionEvent actionEvent) {
        TextArea.appendText(" = " + res);
    }

}