package com.kensoftph.menubar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        // this RadioMenuItem
        RadioMenuItem r1 = new RadioMenuItem("True");
        RadioMenuItem r2 = new RadioMenuItem("False");
        ToggleGroup rGroup = new ToggleGroup();
        rGroup.getToggles().addAll(r1, r2);

        r1.setOnAction(event -> {
            alert();
        });
        r2.setOnAction(event -> {
            alert();
        });

        // This one is CheckMenuItem
        CheckMenuItem c1 = new CheckMenuItem("Stroke for Circle");
        CheckMenuItem c2 = new CheckMenuItem("Stroke for Rectangle");
        c1.setOnAction(event -> {
            alert();
        });
        c2.setOnAction(event -> {
            alert();
        });

        // This one submenu item
        Menu submenu = new Menu("Save As");
        submenu.getItems().addAll(r1, r2);

        // Custom Menu Item
        CustomMenuItem customItem = new CustomMenuItem();
        Button btn = new Button("Kensoft PH");
        TextField text = new TextField();
        customItem.setHideOnClick(false);
        customItem.setContent(text);

        // Separator Menuitem
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        SeparatorMenuItem separatorMenuItem2 = new SeparatorMenuItem();

        item1.setOnAction(event -> {
            alert();
        });
        item2.setOnAction(event -> {
            alert();
        });
        item3.setOnAction(event -> {
            alert();
        });

        //file.getItems().addAll(item1, item2, submenu, separatorMenuItem, item3, separatorMenuItem2, c1, c2);
        file.getItems().addAll(item1, item2, submenu, separatorMenuItem, item3);
        about.getItems().add(customItem);

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