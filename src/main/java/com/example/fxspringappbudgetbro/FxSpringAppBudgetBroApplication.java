package com.example.fxspringappbudgetbro;

import com.example.fxspringappbudgetbro.Controller.MainUicontroller;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class FxSpringAppBudgetBroApplication extends Application {
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        String[] args = getParameters().getRaw().toArray(new String[0]);
        this.applicationContext = new SpringApplicationBuilder()
                .sources(TheApp.class)
                .run(args);
    }



    @Override
    public void start(Stage stage) throws IOException {
        FxWeaver fxWeaver = applicationContext.getBean(FxWeaver.class);
        Parent root = fxWeaver.loadView(MainUicontroller.class);
//      Parent root = FXMLLoader.load(getClass().getResource(("/fxml/main.fxml")));
        Scene scene =  new Scene(root);
        scene.getStylesheets().add("css/stylesheet.css");
        scene.setFill(Color.TRANSPARENT);


        stage.getIcons().add(new Image("/images/money3.png"));
        stage.setTitle("BudgetBro");
        stage.setScene(scene);
        stage.show();


    }

    @Override
    public void stop() {
        this.applicationContext.close();
        Platform.exit();
    }
}