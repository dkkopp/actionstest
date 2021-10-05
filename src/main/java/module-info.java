module com.codebangus.actionstest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.codebangus.actionstest to javafx.fxml;
    exports com.codebangus.actionstest;
}
