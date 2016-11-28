package mysticscour.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RiddleController implements Initializable {

    @FXML
    private Button submit, item;

    @FXML
    private Label response;

    @FXML
    private TextField tf;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void testAnwser(ActionEvent event) throws IOException {
        if (event.getSource() == item) {
            response.setText("Skipped");
        }
        if (event.getSource() == submit) {
            String anwser = tf.getText();
            if (anwser.equalsIgnoreCase("Shadow")) {
                response.setText("Correct");
            } else {
                response.setText("Incorrect");
            }

        }
    }

}
