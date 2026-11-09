/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantorderingapplication;

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
    
    private double selectedEntrée;
    private double selectedDrink;
    private String additionalSpecialRequests;
    private boolean waterSelection;

    public Order() {
        this.selectedEntrée = 0;
        this.selectedDrink = 0;
        this.waterSelection = false;
    }

    public void setSelectedEntrée(double selectedEntrée) {
        this.selectedEntrée = selectedEntrée;
    }

    public void setSelectedDrink(double selectedDrink) {
        this.selectedDrink = selectedDrink;
    }

    public void setAdditionalSpecialRequests(String additionalSpecialRequests) {
        this.additionalSpecialRequests = additionalSpecialRequests;
    }

    public void setWaterSelection(boolean waterSelection) {
        this.waterSelection = waterSelection;
    }
    
    public double calculateTotalPrice() {
        return selectedEntrée + selectedDrink;
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
    
    
}
