module com.example.smiles4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.smiles4 to javafx.fxml;
    exports com.example.smiles4;
}