package com.example.demo4;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.*;
public class ConverterModel {

    public char Convert_to_ascii(String num, int base, Label error_lbl)
    {
        for (int i = 0; i < num.length(); i++)
        {
            if (num.charAt(i)-'0'>=base)
            {
                error_lbl.setText("Неверно введены данные");
                return ' ';
            }
        }
        error_lbl.setText("");
        int num_dec = Integer.parseInt(num, base);
        return (char) num_dec;
    }
    public String Convert_to_binary(String num, int base,Label error_lbl)
    {
        for (int i = 0; i < num.length(); i++)
        {
            if (num.charAt(i)-'0'>=base)
            {
                error_lbl.setText("Неверно введены данные");
                return " ";
            }
        }

        int num_dec = Integer.parseInt(num, base);
        return Integer.toBinaryString(num_dec);
    }
}
