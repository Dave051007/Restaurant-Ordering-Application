package com.mycompany.restaurantorderingapplication;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class OrderController {

    @FXML
    private Button clearOrderButton;

    @FXML
    private RadioButton coffeeRB;

    @FXML
    private ToggleGroup drinkSelectionToggle;

    @FXML
    private ListView<String> entreeList;

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
    
    String[] items = {
        "Chicken Salad",
        "Turkey Sandwich",
        "Vegetable Wrap",
        "Grilled Cheese"
    };
    
    String[] drinks = {
        "Coffee", 
        "Tea", 
        "Soda", 
        "Juice"
    };
    
    Order order = new Order();
    
    @FXML
    void initialize() {

        entreeList.getItems().addAll(items);
        
        specialRequestTF.textProperty().addListener((obs, oldValue, newValue) -> {
            order.setAdditionalSpecialRequests(newValue);
        });

        waterCheckBox.selectedProperty().addListener((obs, oldValue, newValue) -> {
            order.setWaterSelection(newValue);
        });
        
        if (waterCheckBox.isSelected()) {
            order.setWaterSelection(true);
        } else {
            order.setWaterSelection(false);
        }
        
        entreeList.getSelectionModel().selectedItemProperty().addListener( (obs, oldValue, newValue) -> {
            double price = 0;
            
            if (newValue != null) {
                if (newValue.equals(items[0])) {
                    price = order.getChickenSaladPrice();
                } else if (newValue.equals(items[1])) {
                    price = order.getTurkeySandwichPrice();
                } else if (newValue.equals(items[2])) {
                    price = order.getVegetableWrapPrice();
                } else if (newValue.equals(items[3])) {
                    price = order.getGrilledCheesePrice();
                }
            }

            order.setSelectedEntrée(newValue);
            order.setSelectedEntréePrice(price);
            double totalPrice = order.calculateTotalPrice();
            totalPriceLabel.setText("Total: $" + totalPrice);
        });
            
        drinkSelectionToggle.selectedToggleProperty().addListener((obs, oldToggle, newToggle) -> {
            double price = 0;
            
            if (newToggle != null) {
                RadioButton selected = (RadioButton) newToggle;
                
                if (selected.getText().equals(drinks[0])) {
                    price = order.getCoffeePrice();
                } else if (selected.getText().equals(drinks[1])) {
                    price = order.getTeaPrice();
                } else if (selected.getText().equals(drinks[2])) {
                    price = order.getSodaPrice();
                } else if (selected.getText().equals(drinks[3])) {
                    price = order.getJuicePrice();
                }
                
                order.setSelectedDrink(selected.getText());
            }

            order.setSelectedDrinkPrice(price);
            double totalPrice = order.calculateTotalPrice();
            totalPriceLabel.setText("Total: $" + totalPrice);
        });
    }
    
    private void clearOrder() {
        entreeList.getSelectionModel().clearSelection();
        drinkSelectionToggle.selectToggle(null);
        waterCheckBox.setSelected(false);
        totalPriceLabel.setText("Total: $0.0");
        specialRequestTF.setText("");
    }

    @FXML
    void handleClearOrder(ActionEvent event) {
        clearOrder();
    }

    @FXML
    void handlePlaceOrder(ActionEvent event) throws IOException {
        order.placeOrder(order);
    }
    
    @FXML
    void exitApplication(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void handleMenuClearOrder(ActionEvent event) {
        clearOrder();
    }

    @FXML
    void handleMenuPlaceOrder(ActionEvent event) throws IOException {
        order.placeOrder(order);
    }
}
