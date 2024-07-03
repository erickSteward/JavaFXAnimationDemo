package com.example.animationproject;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.css.PseudoClass;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Rectangle rectangle = new Rectangle(100, 100, Color.CORNFLOWERBLUE);
        root.getChildren().add(rectangle);

        //Fade Transition
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), rectangle);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.3);
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);


        //Scale Transition
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), rectangle);
        scaleTransition.setToX(2);
        scaleTransition.setByY(2);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);


        //Sequential Transition
        SequentialTransition sequentialTransition = new SequentialTransition(
                fadeTransition,
                scaleTransition
        );

        sequentialTransition.play();

        Scene scene = new Scene(root, 300 , 300);
        stage.setTitle("Animation Demo");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
