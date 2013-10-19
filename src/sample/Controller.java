package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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


    public Controller() {
        initializeUserInterface();
    }

    private void initializeUserInterface() {
        ButtonProperties buttonProperties = getButtonProperties("");
        setUpButton(buttonBox01, buttonProperties);
        setUpButton(buttonBox01, buttonProperties);
        setUpButton(buttonBox01, buttonProperties);
    }

    @FXML
    protected void onButtonBox01Click(ActionEvent actionEvent) {
        toggleButtonStatus(buttonBox01);
    }

    @FXML
    protected void onButtonBox02Click(ActionEvent actionEvent) {
        toggleButtonStatus(buttonBox02);
    }

    @FXML
    protected void onButtonBox03Click(ActionEvent actionEvent) {
        toggleButtonStatus(buttonBox03);
    }

    protected void toggleButtonStatus(Button button) {
        ButtonProperties buttonProperties = getButtonProperties(button.getText());
        setUpButton(button, buttonProperties);
    }

    private void setUpButton(Button button, ButtonProperties buttonProperties) {
        if (button == null) {
            return;
        }
        button.setText(buttonProperties.title);
        button.setStyle(buttonProperties.backgroundStyle);
    }

    private ButtonProperties getButtonProperties(String status) {
        if (status.equals("Press to reserve")) {
            return new ButtonProperties() {{
                backgroundStyle = "-fx-background-color: red;";
                title = "Press to release";
            }};
        } else {
            return new ButtonProperties() {{
                backgroundStyle = "-fx-background-color: green;";
                title = "Press to reserve";
            }};
        }
    }


    public static class ButtonProperties {
        String backgroundStyle;
        String title;
    }
}
