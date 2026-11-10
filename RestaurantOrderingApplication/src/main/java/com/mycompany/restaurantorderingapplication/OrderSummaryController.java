package com.mycompany.restaurantorderingapplication;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;

public class OrderSummaryController {
    @FXML
    private Button closeButton;

    @FXML
    private Label drinkLabel;

    @FXML
    private Label drinkPriceLabel;

    @FXML
    private Label entreeLabel;

    @FXML
    private Label entreePriceLabel;

    @FXML
    private Label specialRequestLabel;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private Label waterLabel;

    private Order order;
        
    @FXML
    void closeSummary(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.close();
    }   
}
    
