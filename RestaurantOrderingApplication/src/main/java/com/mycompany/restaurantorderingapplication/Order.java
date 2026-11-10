/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantorderingapplication;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 6375254
 */
public class Order {
    // entree prices
    private final double chickenSaladPrice = 6.50;
    private final double turkeySandwichPrice = 6.75;
    private final double vegetableWrapPrice = 6.00;
    private final double grilledCheesePrice = 5.00;
    
    // drinks prices
    private final double coffeePrice = 1.50;
    private final double teaPrice = 1.50;
    private final double sodaPrice = 2.00;
    private final double juicePrice = 1.75;
    
    private double selectedEntréePrice;
    private double selectedDrinkPrice;
    
    private String selectedEntrée;
    private String selectedDrink;
    
    private String additionalSpecialRequests;
    private boolean waterSelection;

    public Order() {
        this.selectedEntréePrice = 0;
        this.selectedDrinkPrice = 0;
        this.selectedEntrée = null;
        this.selectedDrink = null;
        this.waterSelection = false;
    }
    
    public double calculateTotalPrice() {
        return selectedEntréePrice + selectedDrinkPrice;
    }
    
    public void placeOrder(Order order) throws IOException {
        FXMLLoader loader = new FXMLLoader(
        getClass().getResource("orderSummary.fxml")
        );
        
        Parent root = loader.load();
        
        OrderSummaryController controller = loader.getController();

        controller.initialize(order);
        
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Order Summary");
        stage.show();
    }

    public void setSelectedEntrée(String selectedEntrée) {
        this.selectedEntrée = selectedEntrée;
    }

    public void setSelectedDrink(String selectedDrink) {
        this.selectedDrink = selectedDrink;
    }
    
    public void setSelectedEntréePrice(double selectedEntréePrice) {
        this.selectedEntréePrice = selectedEntréePrice;
    }

    public void setSelectedDrinkPrice(double selectedDrinkPrice) {
        this.selectedDrinkPrice = selectedDrinkPrice;
    }

    public void setAdditionalSpecialRequests(String additionalSpecialRequests) {
        this.additionalSpecialRequests = additionalSpecialRequests;
    }

    public void setWaterSelection(boolean waterSelection) {
        this.waterSelection = waterSelection;
    }
    
    public double getChickenSaladPrice() {
        return chickenSaladPrice;
    }

    public double getTurkeySandwichPrice() {
        return turkeySandwichPrice;
    }

    public double getVegetableWrapPrice() {
        return vegetableWrapPrice;
    }

    public double getGrilledCheesePrice() {
        return grilledCheesePrice;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public double getTeaPrice() {
        return teaPrice;
    }

    public double getSodaPrice() {
        return sodaPrice;
    }

    public double getJuicePrice() {
        return juicePrice;
    }

    public double getSelectedEntréePrice() {
        return selectedEntréePrice;
    }

    public double getSelectedDrinkPrice() {
        return selectedDrinkPrice;
    }

    public String getSelectedEntrée() {
        return selectedEntrée;
    }

    public String getSelectedDrink() {
        return selectedDrink;
    }

    public String getAdditionalSpecialRequests() {
        return additionalSpecialRequests;
    }

    public boolean isWaterSelection() {
        return waterSelection;
    }

    
}
