/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysticscour.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.MenuButton;
import java.util.concurrent.TimeUnit;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import mysticscour.model.MazePuzzle;

/**
 * FXML Controller class
 *
 * @author Hunter
 */
public class ScaleController implements Initializable {

    int turns = 0;
    int stone1weight = 10;
    int stone2weight = 10;
    int stone3weight = 10;
    int stone4weight = 10;
    int stone5weight = 10;
    int stone6weight = 20;
    int stone7weight = 10;
    int stone8weight = 10;
    boolean winner = false;

    @FXML
    private Button nextPuzzle;

    @FXML
    public MenuButton menuButton;

    @FXML
    private Button item, stone1, stone2, stone3, stone4, stone5, stone6, stone7, stone8;

    @FXML
    private Label response;

    @FXML
    private ImageView original, same1, same2, same3, different1, different2, different3, oneStone, twoStones, threeStones;

    @FXML
    private void clickWrong(ActionEvent event) throws InterruptedException {
        menuButton.setVisible(false);
        if (oneStone.isVisible()) {
            oneStone.setVisible(false);
            same1.setVisible(true);
            TimeUnit.SECONDS.sleep(1);
            turns++;
            same1.setVisible(false);
            original.setVisible(true);
            menuButton.setVisible(true);

        } else {
            oneStone.setVisible(true);
        }
        if (winner = false) {
            different1.setVisible(true);
            win(winner);
        }
        if (turns == 3) {
            fail();
        }
    }

    @FXML
    private void clickRight(ActionEvent event) {
        menuButton.setVisible(false);
        if (oneStone.isVisible()) {
            oneStone.setVisible(false);
            different1.setVisible(true);
            winner = true;
            if (winner) {
                win(winner);
            }
        } else {
            oneStone.setVisible(true);
            winner = true;
        }
    }

    @FXML
    private void item(ActionEvent event) {
        if (event.getSource() == item) {
            response.setText("Skipped");
            nextPuzzle.setVisible(true);

        }
    }

    private void fail() {
        turns = 0;
        original.setVisible(true);
        response.setText("You Failed");
    }

    private void win(boolean winner) {
        response.setText("Completed");
        nextPuzzle.setVisible(true);

    }

    public void loadNextPuzzle() throws IOException {
        String[] s = {"8"};
        MazePuzzle.MazePuzzleStart(s);
        Stage stage = null;
        Parent root = null;
        stage = (Stage) nextPuzzle.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Maze.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MenuItem item1 = new MenuItem("Place stone 1, 2, and 3 on scale");
        MenuItem item2 = new MenuItem("Place stone 4, 5, and 6 on scale");
        MenuItem item3 = new MenuItem("Place stone 7 and 8 on the scale");
        menuButton.getItems().addAll(item1, item2, item3);
        item1.setOnAction((event) -> {
            if (threeStones.isVisible()) {
                turns++;
                if (turns > 3) {
                    fail();
                }
                if (winner) {
                    threeStones.setVisible(false);
                    different3.setVisible(true);
                    win(winner);
                }
                threeStones.setVisible(false);
                same3.setVisible(true);

                same3.setVisible(false);
                fail();
            } else {
                threeStones.setVisible(true);
            }
        });
        item2.setOnAction((event) -> {
            if (threeStones.isVisible()) {
                threeStones.setVisible(false);
                different3.setVisible(true);
                win(winner);
            } else {
                threeStones.setVisible(true);
                winner = true;
            }
        });
        item3.setOnAction((event) -> {
            turns++;
            same1.setVisible(true);

            same1.setVisible(false);
            fail();
        });
    }

}
