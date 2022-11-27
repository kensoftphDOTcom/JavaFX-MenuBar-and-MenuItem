package com.kensoftph.menubar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu-bar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("JavaFX MenuBar");
        stage.setScene(scene);
        stage.show();*/

        BorderPane layout = new BorderPane();
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        Menu about = new Menu("About");
        layout.setTop(menuBar);

        menuBar.setUseSystemMenuBar(true);

        menuBar.getMenus().addAll(file,about);

        MenuItem item1 = new MenuItem("Open");
        MenuItem item2 = new MenuItem("Save");
        MenuItem item3 = new MenuItem("Exit");

        item1.setOnAction(event -> {
            alert();
        });
        item2.setOnAction(event -> {
            alert();
        });
        item3.setOnAction(event -> {
            alert();
        });

        file.getItems().addAll(item1, item2, item3);

        Scene scene = new Scene(layout, 500, 500);
        stage.setScene(scene);
        stage.setTitle("JavaFX MenuBar");
        stage.show();
    }

    private void alert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("JavaFX MenuBar");
        alert.setHeaderText("Menu Item");
        alert.setContentText("Clicked");
        alert.show();
    }

    public static void main(String[] args) {
        launch();
    }
}