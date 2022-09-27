package com.example.fxspringappbudgetbro.Controller;

import com.example.fxspringappbudgetbro.Service.UserService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
@FxmlView("fxml/main.fxml")
public class MainUicontroller implements Initializable {


    @Autowired
    UserService userService;

    @FXML
    private Button BT1;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
