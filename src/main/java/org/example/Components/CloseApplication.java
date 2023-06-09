package org.example.Components;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class CloseApplication extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Java Fx- the new boston ");

        window.setOnCloseRequest(event-> {
            event.consume();
            closeProgram();

        });

        button = new Button("Close Program");
        button.setOnAction(e->closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){
       Boolean answer = ConfirmBox.display("Title","Sure you want to exit?");
       if(answer){
           window.close();
       }
    }
}
