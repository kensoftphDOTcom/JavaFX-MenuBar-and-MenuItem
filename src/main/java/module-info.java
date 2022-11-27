module com.kensoftph.menubar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.menubar to javafx.fxml;
    exports com.kensoftph.menubar;
}