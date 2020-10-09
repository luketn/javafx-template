package com.mycodefu.dashboard.light;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javax.inject.Inject;

public class LightPresenter implements Initializable {

    @FXML
    Circle light;

    @Inject
    int red;

    @Inject
    int green;

    @Inject
    int blue;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        light.setFill(Color.rgb(red, green, blue));
    }

}
