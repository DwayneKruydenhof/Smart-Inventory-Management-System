module com.dwayne.inventory.smartinventorymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dwayne.inventory.smartinventorymanagementsystem to javafx.fxml;
    exports com.dwayne.inventory.smartinventorymanagementsystem;
}