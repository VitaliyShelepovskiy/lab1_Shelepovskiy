package com.example.demo4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
//102 - восьмеричн.
//43 - шестн.
//65 - десят.
public class MainApp extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("ConverterView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 320);
        stage.setTitle("Lab1_Shelepovskiy");
        stage.setScene(scene);
        stage.show();
    }
}
