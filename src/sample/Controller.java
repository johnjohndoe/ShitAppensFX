package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    Label labelBox01;
    @FXML
    Label labelBox02;
    @FXML
    Label labelBox03;

    @FXML
    Button buttonBox01;
    @FXML
    Button buttonBox02;
    @FXML
    Button buttonBox03;

    @FXML
    Rectangle rectangleBox01;
    @FXML
    Rectangle rectangleBox02;
    @FXML
    Rectangle rectangleBox03;

    @FXML
    protected void onButtonBox01Click(ActionEvent actionEvent) {
        toggleButtonStatus(actionEvent, buttonBox01);
        toggleLabelStatus(actionEvent, labelBox01);
        toggleRectangleStatus(actionEvent, rectangleBox01);
    }

    @FXML
    protected void onButtonBox02Click(ActionEvent actionEvent) {
        toggleButtonStatus(actionEvent, buttonBox02);
        toggleLabelStatus(actionEvent, labelBox02);
        toggleRectangleStatus(actionEvent, rectangleBox02);
    }

    @FXML
    protected void onButtonBox03Click(ActionEvent actionEvent) {
        toggleButtonStatus(actionEvent, buttonBox03);
        toggleLabelStatus(actionEvent, labelBox03);
        toggleRectangleStatus(actionEvent, rectangleBox03);
    }

    protected void toggleButtonStatus(ActionEvent actionEvent, Button button) {
        button.setText((button.getText().equals("Reserve")) ? "Release" : "Reserve");
    }

    protected void toggleLabelStatus(ActionEvent actionEvent, Label label) {
        label.setText((label.getText().equals("Taken")) ? "Free" : "Taken");
    }

    protected void toggleRectangleStatus(ActionEvent actionEvent, Rectangle rectangle) {
        rectangle.setFill((rectangle.getFill() == Color.RED) ? Color.GREEN : Color.RED);
    }

}
