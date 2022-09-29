package com.example.fxspringappbudgetbro.Controller;

import com.example.fxspringappbudgetbro.Model.Budget;
import com.example.fxspringappbudgetbro.Service.BudgetService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

@Component
@FxmlView("/fxml/main.fxml")
public class MainUicontroller implements Initializable {


    @Autowired
    private BudgetService budgetService;


    @FXML
    private Button ADDBTN;

    @FXML
    private Button ADDBTN1;

    @FXML
    private Button BT3;

    @FXML
    private Button CLEARFIELDS;

    @FXML
    private Button DELBTN;

    @FXML
    private TextField DELITEMITD;

    @FXML
    private TextField ITEM;

    @FXML
    private Label LB1;

    @FXML
    private Label LB11;

    @FXML
    private Label LB2;

    @FXML
    private Label LB21;

    @FXML
    private Label LB211;

    @FXML
    private Label LB3err;

    @FXML
    private TextField PRICE;

    @FXML
    private TextField UPDTNAME;

    @FXML
    private TextField UPITEM;

    @FXML
    private TextField UPRICE;


    @FXML
    void viewList(ActionEvent event) throws Exception {


        try {
            Stage stage = new Stage();
//          Parent root = FXMLLoader.load(getClass().getResource("/fxml/table.fxml"));


            Parent root = FXMLLoader.load(getClass().getResource("/fxml/table.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("css/stylesheet.css");
            stage.setScene(scene);
            stage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    void ClearField(ActionEvent event) {

    }
    @FXML
    void addItem(ActionEvent event) {
        String item;
        double price;

        ArrayList<TextField> txtList = new ArrayList<>();
        txtList.add(ITEM);
        txtList.add(PRICE);


        for (TextField nodes : txtList)
        {
            if (nodes.getText().isEmpty()) {
                LB3err.setText("PLEASE complete all the FIELDS!");
            }
            else
            {
                item=ITEM.getText();
                price= Double.parseDouble(PRICE.getText());
                Budget budget = new Budget();
                budget.setItem(item);
                budget.setPrice(price);
                budget.setDatecreated(LocalDateTime.now());
                budgetService.save(budget);
                LB3err.setText("SUCCESSFULLY ADDED ITEM!");
            }
        }

    }
    @FXML
    void updtItem(ActionEvent event) {
        Long ID;
        double price;

        ArrayList<TextField> txtList = new ArrayList<>();
        txtList.add(UPITEM);
        txtList.add(UPRICE);
        for (TextField nodes : txtList)
        {
            if (nodes.getText().isEmpty()) {
                LB3err.setText("PLEASE complete all the FIELDS!");
            }
//            else if ()
            {



            }
        }

    }
    @FXML
    void deleteItem(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
