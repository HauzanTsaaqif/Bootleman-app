module com.example.bootlemanapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.bootlemanapp to javafx.fxml;
    exports com.example.bootlemanapp;
}