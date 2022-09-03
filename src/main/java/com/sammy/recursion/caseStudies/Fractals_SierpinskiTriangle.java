package com.sammy.recursion.caseStudies;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Fractals_SierpinskiTriangle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane();
        TextField enterTriangleOrder = new TextField();
        enterTriangleOrder.setOnAction(event -> trianglePane.setTriangleOrderNumber(Integer.parseInt(enterTriangleOrder.getText())));
        enterTriangleOrder.setPrefColumnCount(4);
        enterTriangleOrder.setAlignment(Pos.BOTTOM_RIGHT);

        //Pane to hold label, text field, and button
        HBox textFiled = new HBox(10);
        textFiled.getChildren().addAll(new Label("Enter a triangle Order: "), enterTriangleOrder);
        textFiled.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(textFiled);

        //Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 210);
        primaryStage.setTitle("Sierpinski Triangle");
        primaryStage.setScene(scene);
        primaryStage.show(); //Display stage

        trianglePane.widthProperty().addListener(observable -> trianglePane.paint());
        trianglePane.heightProperty().addListener(observable -> trianglePane.paint());
    }
}
