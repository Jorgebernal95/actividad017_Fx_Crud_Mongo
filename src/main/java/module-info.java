module com.empresa.actividad017fxcrudmongo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.actividad017fxcrudmongo to javafx.fxml;
    exports com.empresa.actividad017fxcrudmongo;
}