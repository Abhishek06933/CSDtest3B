module com.example.test3b_abhi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test3b_abhi to javafx.fxml;
    exports com.example.test3b_abhi;
}