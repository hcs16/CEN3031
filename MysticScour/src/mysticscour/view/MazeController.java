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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MazeController implements Initializable {

    @FXML
    private Button startPuzzle;

    @FXML
    private TextArea storyText;

    @FXML
    private Button nextPuzzle;

    public void showPuzzle() {
        startPuzzle.setVisible(false);
        storyText.setVisible(false);
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
