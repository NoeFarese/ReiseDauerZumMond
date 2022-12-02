module ch.css.reisedauerzummond {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.css.reisedauerzummond to javafx.fxml;
    exports ch.css.reisedauerzummond;
}