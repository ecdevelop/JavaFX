package org.example.Components;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.w3c.dom.Text;

import java.awt.*;

public class GridPaneExample extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("the new boston - JAVAFX ");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);

        //Name label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel,0,0);

        //Name Input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput,1,0);

        //Password label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0,1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1,2);

         grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);

        Scene scene = new Scene(grid, 300,200);
        window.setScene(scene);

        window.show();
    }
}
