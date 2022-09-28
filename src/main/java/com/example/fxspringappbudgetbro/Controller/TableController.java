package com.example.fxspringappbudgetbro.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import org.springframework.stereotype.Component;


@Component
public class TableController {



    @FXML
    private TableView<?> TBVIEW1;

    @FXML
    private TableColumn<?, ?> IDCOL;

    @FXML
    private TableColumn<?, ?> ITEMCOL;



    @FXML
    private Pane TBVIEW;
}
