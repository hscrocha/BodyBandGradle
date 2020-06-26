package com.BodyBand.controller;

import javafx.fxml.FXML;
import com.BodyBand.sceneNavigation;

public class About {

    @FXML
    private void onClickedReturn(){
        sceneNavigation.getInstance().showOptionsPage();
    }
}
