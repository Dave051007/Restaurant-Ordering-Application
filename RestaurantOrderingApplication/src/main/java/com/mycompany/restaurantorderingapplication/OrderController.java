package com.mycompany.restaurantorderingapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class OrderController {

    @FXML
    private Button clearOrderButton;

    @FXML
    private RadioButton coffeeRB;

    @FXML
    private ToggleGroup drinkSelectionToggle;

    @FXML
    private ListView<?> entreeList;

    @FXML
    private RadioButton juiceRB;

    @FXML
    private Button placeOrderButton;

    @FXML
    private RadioButton sodaRB;

    @FXML
    private TextField specialRequestTF;

    @FXML
    private RadioButton teaRB;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private CheckBox waterCheckBox;

    @FXML
    void handleClearOrder(ActionEvent event) {

    }

    @FXML
    void handlePlaceOrder(ActionEvent event) {

    }
}
