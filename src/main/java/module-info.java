module com.jaqueline.marketplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jaqueline.marketplace to javafx.fxml;
    exports com.jaqueline.marketplace;
}