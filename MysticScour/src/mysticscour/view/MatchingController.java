package mysticscour.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Hunter
 */
public class MatchingController implements Initializable {

    int clicks = 0;
    @FXML
    private Button startPuzzle;

    @FXML
    private TextArea storyText;

    @FXML
    private Button item, begin, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @FXML
    private Button nextPuzzle;

    @FXML
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;

    @FXML
    private Label response;

    @FXML
    private void item(ActionEvent event) {
        if (event.getSource() == item) {
            response.setText("Skipped");
            nextPuzzle.setVisible(true);
        }
    }

    public void showPuzzle() {
        startPuzzle.setVisible(false);
        storyText.setVisible(false);
    }

    @FXML
    private void begin(ActionEvent event) {
        img1.setVisible(false);
        img2.setVisible(false);
        img3.setVisible(false);
        img4.setVisible(false);
        img5.setVisible(false);
        img6.setVisible(false);
        img7.setVisible(false);
        img8.setVisible(false);
        img9.setVisible(false);
        img10.setVisible(false);
        img11.setVisible(false);
        img12.setVisible(false);
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        btn9.setVisible(true);
        btn10.setVisible(true);
        btn11.setVisible(true);
        btn12.setVisible(true);
    }

    @FXML
    private void click1(ActionEvent event) {
        clicks++;
        img1.setVisible(true);
        btn1.setVisible(false);

        if (img8.isVisible()) {
            img1.setVisible(false);
            img8.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img5.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click2(ActionEvent event) {
        clicks++;
        btn2.setVisible(false);
        img2.setVisible(true);

        if (img4.isVisible()) {
            img2.setVisible(false);
            btn2.setVisible(true);
        } else if (clicks == 2) {
            if (img1.isVisible() || img3.isVisible() || img8.isVisible() || img5.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click3(ActionEvent event) {
        clicks++;
        img3.setVisible(true);
        btn3.setVisible(false);

        if (img11.isVisible()) {
            img3.setVisible(false);
            img11.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img1.isVisible() || img4.isVisible() || img5.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img8.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click4(ActionEvent event) {
        clicks++;
        img4.setVisible(true);
        btn4.setVisible(false);

        if (img2.isVisible()) {
            img4.setVisible(false);
            img2.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img1.isVisible() || img3.isVisible() || img8.isVisible() || img5.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click5(ActionEvent event) {
        clicks++;
        img5.setVisible(true);
        btn5.setVisible(false);

        if (img12.isVisible()) {
            img5.setVisible(false);
            img12.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img1.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img11.isVisible() || img8.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click6(ActionEvent event) {
        clicks++;
        img6.setVisible(true);
        btn6.setVisible(false);

        if (img10.isVisible()) {
            img6.setVisible(false);
            img10.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img5.isVisible() || img1.isVisible() || img7.isVisible() || img9.isVisible() || img8.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click7(ActionEvent event) {
        clicks++;
        img7.setVisible(true);
        btn7.setVisible(false);

        if (img9.isVisible()) {
            img9.setVisible(false);
            img7.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img5.isVisible() || img6.isVisible() || img1.isVisible() || img8.isVisible() || img10.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click8(ActionEvent event) {
        clicks++;
        img8.setVisible(true);
        btn8.setVisible(false);

        if (img1.isVisible()) {
            img1.setVisible(false);
            img8.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img5.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click9(ActionEvent event) {
        clicks++;
        img9.setVisible(true);
        btn9.setVisible(false);

        if (img7.isVisible()) {
            img9.setVisible(false);
            img7.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img5.isVisible() || img6.isVisible() || img1.isVisible() || img8.isVisible() || img10.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click10(ActionEvent event) {
        clicks++;
        img10.setVisible(true);
        btn10.setVisible(false);

        if (img6.isVisible()) {
            img10.setVisible(false);
            img6.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img5.isVisible() || img1.isVisible() || img7.isVisible() || img9.isVisible() || img8.isVisible() || img11.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click11(ActionEvent event) {
        clicks++;
        img11.setVisible(true);
        btn11.setVisible(false);

        if (img3.isVisible()) {
            img11.setVisible(false);
            img3.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img1.isVisible() || img4.isVisible() || img5.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img8.isVisible() || img12.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);
        }
    }

    @FXML
    private void click12(ActionEvent event) {
        clicks++;
        img12.setVisible(true);
        btn12.setVisible(false);

        if (img5.isVisible()) {
            img1.setVisible(false);
            img5.setVisible(false);
            clicks = 0;
        } else if (clicks == 2) {
            if (img2.isVisible() || img3.isVisible() || img4.isVisible() || img1.isVisible() || img6.isVisible() || img7.isVisible() || img9.isVisible() || img10.isVisible() || img11.isVisible() || img8.isVisible()) {
                img1.setVisible(true);
                img2.setVisible(true);
                img3.setVisible(true);
                img4.setVisible(true);
                img5.setVisible(true);
                img6.setVisible(true);
                img7.setVisible(true);
                img8.setVisible(true);
                img9.setVisible(true);
                img10.setVisible(true);
                img11.setVisible(true);
                img12.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
            }
        }
        if (clicks == 2) {
            clicks = 0;
        }
        if (!img1.isVisible() && !img2.isVisible() && !img3.isVisible() && !img4.isVisible() && !img5.isVisible() && !img6.isVisible() && !img7.isVisible() && !img8.isVisible() && !img9.isVisible() && !img10.isVisible() && !img11.isVisible() && !img12.isVisible() && !btn1.isVisible() && !btn2.isVisible() && !btn3.isVisible() && !btn4.isVisible() && !btn5.isVisible() && !btn6.isVisible() && !btn7.isVisible() && !btn8.isVisible() && !btn9.isVisible() && !btn10.isVisible() && !btn11.isVisible() && !btn12.isVisible()) {
            response.setText("Solved");
            nextPuzzle.setVisible(true);

        }
    }

    public void loadNextPuzzle() throws IOException {
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
    }

}
