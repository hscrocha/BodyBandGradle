module BodyBandAndroid {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    //required for JavaFX to access BodyBand DB methods and associated controllers
    opens com.BodyBand to javafx.fxml;
    opens com.BodyBand.model;
    opens com.BodyBand.controller;
    exports com.BodyBand;
}