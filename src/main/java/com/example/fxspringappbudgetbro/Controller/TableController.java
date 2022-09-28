package com.example.fxspringappbudgetbro.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import org.springframework.stereotype.Component;


@Component
public class TableController {



    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private TableColumn<?, ?> ITEM;

    @FXML
    private TableColumn<?, ?> PRICE;


    @FXML
    private Pane TBVIEW;
}
