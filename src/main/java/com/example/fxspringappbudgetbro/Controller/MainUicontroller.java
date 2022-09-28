package com.example.fxspringappbudgetbro.Controller;

import com.example.fxspringappbudgetbro.Service.UserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainUicontroller implements Initializable {


    @Autowired
    UserService userService;


    @FXML
    private Button BT1;

    @FXML
    private Button BT3;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;


    @FXML
    void viewList(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
