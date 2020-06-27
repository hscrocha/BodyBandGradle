module BodyBandAndroid {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;

    opens com.BodyBand;

    //required for JavaFX to access BodyBand DB methods and associated controllers
    opens com.BodyBand.model;
    opens com.BodyBand.controller;
}