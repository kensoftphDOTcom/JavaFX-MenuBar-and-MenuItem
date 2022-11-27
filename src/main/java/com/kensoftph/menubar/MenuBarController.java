package com.kensoftph.menubar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuBarController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}