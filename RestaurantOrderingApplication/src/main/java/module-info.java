module com.mycompany.restaurantorderingapplication {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.restaurantorderingapplication to javafx.fxml;
    exports com.mycompany.restaurantorderingapplication;
}
