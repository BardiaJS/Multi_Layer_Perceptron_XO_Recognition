module com.example.xo_multi_layer_perceptron_algorithm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.xo_multi_layer_perceptron_algorithm to javafx.fxml;
    exports com.example.xo_multi_layer_perceptron_algorithm;
}