package gui;

import core.WhatToCook;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Mateusz on 25.05.2016.
 * Project WhatToCook
 */
public class AboutWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = new Stage();
        BorderPane mainBorderPane = new BorderPane();

        Label titleLable = new Label("Autorzy:");
        titleLable.setMaxWidth(Double.MAX_VALUE);
        titleLable.setTextAlignment(TextAlignment.CENTER);
        titleLable.setAlignment(Pos.CENTER);
        titleLable.setId("biggerlabel");
        Label autorsLabel = new Label("Radosław Chruski" + WhatToCook.endl +"Robert Górnicki" + WhatToCook.endl + "Mateusz Kalinowski" + WhatToCook.endl + "Paweł Kurbiel" + WhatToCook.endl + "Oksana  Stechkevych");
        autorsLabel.setMaxWidth(Double.MAX_VALUE);
        autorsLabel.setAlignment(Pos.CENTER);
        Label versionLabel = new Label("Wersja 2.0");
        versionLabel.setMaxWidth(Double.MAX_VALUE);
        versionLabel.setAlignment(Pos.CENTER);
        versionLabel.setTextAlignment(TextAlignment.CENTER);
        autorsLabel.setTextAlignment(TextAlignment.CENTER);
        mainBorderPane.setTop(titleLable);
        mainBorderPane.setCenter(autorsLabel);
        mainBorderPane.setBottom(versionLabel);

        mainScene = new Scene(mainBorderPane,200,200);
        mainStage.setScene(mainScene);
        mainStage.initModality(Modality.APPLICATION_MODAL);
        mainScene.getStylesheets().add(MainStage.class.getResource("css/style.css").toExternalForm());
        mainStage.show();
    }

    Stage mainStage;
    Scene mainScene;
}
