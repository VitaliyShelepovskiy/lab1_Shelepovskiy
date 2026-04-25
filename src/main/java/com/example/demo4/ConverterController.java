package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ConverterController {
    @FXML
    private ComboBox<String> cmb;
    @FXML
    private TextField input_f;
    @FXML
    private TextField ascii_f;
    @FXML
    private TextField binary_f;
    @FXML
    private Label error_lbl;
    @FXML
    public void initialize()
    {
        cmb.getItems().setAll("2","8","10","16");
    }
    @FXML
    public void Conv()
    {
        ConverterModel model = new ConverterModel();
        String input = input_f.getText();
        char ascii = model.Convert_to_ascii(input, Integer.parseInt(cmb.getValue()),error_lbl);
        ascii_f.setText(String.valueOf(ascii));
        String binary = model.Convert_to_binary(input, Integer.parseInt(cmb.getValue()),error_lbl);
        binary_f.setText(binary);
    }
}
