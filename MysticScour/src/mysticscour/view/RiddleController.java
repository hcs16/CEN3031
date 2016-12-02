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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RiddleController implements Initializable {

    @FXML
    private Button submit, item;

    @FXML
    private Button nextPuzzle;

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
            nextPuzzle.setVisible(true);
        }
        if (event.getSource() == submit) {
            String anwser = tf.getText();
            if (anwser.equalsIgnoreCase("Shadow")) {
                response.setText("Correct");
                nextPuzzle.setVisible(true);
            } else {
                response.setText("Incorrect");
            }

        }
    }

    public void loadNextPuzzle() throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) nextPuzzle.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Scale.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
