module edu.farmingdale.csc325_intoproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc325_intoproj to javafx.fxml;
    exports edu.farmingdale.csc325_intoproj;
}