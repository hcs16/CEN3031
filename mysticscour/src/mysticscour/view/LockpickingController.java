package mysticscour.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Hunter
 */
public class LockpickingController implements Initializable {

    @FXML
    private Button startPuzzle;

    @FXML
    private TextArea storyText;

    @FXML
    private Button unlock;
    @FXML
    private Button item;
    @FXML
    private Button nextPuzzle;
    @FXML
    private Slider slider1;
    @FXML
    private Slider slider2;
    @FXML
    private Slider slider3;
    @FXML
    private Slider slider4;

    @FXML
    private Label response;

    @FXML
    private void unlock(ActionEvent event) throws IOException {
        if (event.getSource() == item) {
            response.setText("Skipped");
            nextPuzzle.setVisible(true);
        }
        if (event.getSource() == unlock) {
            double value1 = slider1.getValue();
            double value2 = slider2.getValue();
            double value3 = slider3.getValue();
            double value4 = slider4.getValue();

            //correct answer
            if (value1 == .8 && value2 == .2 && value3 == .6 && value4 == .4) {
                response.setText("The door has been unlocked");
                nextPuzzle.setVisible(true);
            } //all sliders too far
            else if (value1 > .8 && value2 > .2 && value3 > .6 && value4 > .4) {
                response.setText("All are too far");
            } //all sliders too short
            else if (value1 < .8 && value2 < .2 && value3 < .6 && value4 < .4) {
                response.setText("All are too short");
            }//all sliders are just incorrect 
            else if ((value1 > .8 || value1 < .8) && (value2 > .2 || value2 < .2) && (value3 > .6 || value3 < .6) && (value4 > .4 || value4 < .4)) {
                response.setText("All sliders are incorrect");
            } //slider1 wrong
            else if ((value1 > .8 || value1 < .8) && value2 == .2 && value3 == .6 && value4 == .4) {
                response.setText("Only one slider is wrong");
            } //slider2 wrong
            else if (value1 == .8 && (value2 > .2 || value2 < .2) && value3 == .6 && value4 == .4) {
                response.setText("Only one slider is wrong");
            } //slider 3 wrong
            else if (value1 == .8 && value2 == .2 && (value3 > .6 || value3 < .6) && value4 == .4) {
                response.setText("Only one slider is wrong");
            } //slider 4 wrong
            else if (value1 == .8 && value2 == .2 && value3 == .6 && (value4 > .4 || value4 < .4)) {
                response.setText("Only one slider is wrong");
            } //sliders 1, 2, and 4 wrong, slider 3 correct
            else if ((value1 > .8 || value1 < .8) && (value2 > .2 || value2 < .2) && value3 == .6 && (value4 > .4 || value4 < .4)) {
                response.setText("Three sliders are incorrect");
            } //sliders 1, 3, and 4 wrong, slider 2 correct
            else if ((value1 > .8 || value1 < .8) && value2 == .2 && (value3 > .6 || value3 < .6) && (value4 > .4 || value4 < .4)) {
                response.setText("Three sliders are incorrect");
            } //slider 2, 3, and 4 wrong, slider 1 correct
            else if (value1 == .8 && (value2 > .2 || value2 < .2) && (value3 > .6 || value3 < .6) && (value4 > .4 || value4 < .4)) {
                response.setText("Three sliders are incorrect");
            } //slider 1, 2, and 3 wrong, slider 4 correct
            else if ((value1 > .8 || value1 < .8) && (value2 > .2 || value2 < .2) && (value3 > .6 || value3 < .6) && value4 == .4) {
                response.setText("Three sliders are incorrect");
            } //slider 1 and 2 wrong, slider 3 and 4 correct
            else if ((value1 > .8 || value1 < .8) && (value2 > .2 || value2 < .2) && value3 == .6 && value4 == .4) {
                response.setText("Two sliders are incorrect");
            } //slider 1 and 3 wrong, slider 2 and 4 correct
            else if ((value1 > .8 || value1 < .8) && value2 == .2 && (value3 > .6 || value3 < .6) && value4 == .4) {
                response.setText("Two sliders are incorrect");
            } //slider 1 and 4 wrong, slider 2 and 3 correct
            else if ((value1 > .8 || value1 < .8) && value2 == .2 && value3 == .6 && (value4 > .4 || value4 < .4)) {
                response.setText("Two sliders are incorrect");
            } //slider 2 and 3 wrong, slider 1 and 4 correct
            else if (value1 == .8 && (value2 > .2 || value2 < .2) && (value3 > .6 || value3 < .6) && value4 == .4) {
                response.setText("Two sliders are incorrect");
            } //slider 2 and 4 wrong, slider 1 and 3 correct
            else if (value1 == .8 && (value2 > .2 || value2 < .2) && value3 == .6 && (value4 > .4 || value4 < .4)) {
                response.setText("Two sliders are incorrect");
            } //slider 3 and 4 wrong, slider 1 and 2 correct
            else if (value1 == .8 && value2 == .2 && (value3 > .6 || value3 < .6) && (value4 > .4 || value4 < .4)) {
                response.setText("Two sliders are incorrect");
            } else
              ;
        }
    }

    public void loadNextPuzzle() throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) nextPuzzle.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Riddle.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showPuzzle() {
        startPuzzle.setVisible(false);
        storyText.setVisible(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
