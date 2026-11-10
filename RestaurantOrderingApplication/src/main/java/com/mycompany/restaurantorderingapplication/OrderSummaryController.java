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
        
    public void initialize(Order order) {
        this.order = order;

        entreeLabel.setText(order.getSelectedEntrée());
        drinkLabel.setText(order.getSelectedDrink());

        entreePriceLabel.setText("$" + order.getSelectedEntréePrice());
        drinkPriceLabel.setText("$" + order.getSelectedDrinkPrice());

        boolean waterSelected = order.isWaterSelection();
        String isSelected = (waterSelected) ? "Yes" : "No";
        waterLabel.setText(isSelected);

        specialRequestLabel.setText(order.getAdditionalSpecialRequests());

        totalPriceLabel.setText("$" + order.calculateTotalPrice());
    }
    
    @FXML
    void closeSummary(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.close();
    }   
}
    
