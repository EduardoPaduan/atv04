package com.example.atvava04;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label txtSaida;
    @FXML
    private TextField txtEntrada;
    @FXML
    private Button btnEmpilhar;
    @FXML
    private Button btnDesempilhar;

    @FXML
    private void oi() {
        txtSaida.setText("Welcome!");
    }
}