

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.*;


public class Test extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox();
        HBox buttons = new HBox();
        buttons.getStyleClass().add("buttons");

        Button enter = new Button("Enter");
        enter.getStyleClass().add("enter");

        buttons.getChildren().addAll(enter);

        GridPane pane = new GridPane();
        pane.add(buttons,1,3);

        Scene scene = new Scene(pane, 700,300);
        scene.getStylesheets().add("Style.css");
        stage.setScene(scene);
        stage.show();
    }
}