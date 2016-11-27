package mysticscour;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import mysticscour.view.MainMenuController;

public class MysticScour extends Application {

    private Stage primaryStage;
    private AnchorPane mainPane;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Mystic Scour");
        showMainMenuPane();
    }

    private void showMainMenuPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MysticScour.class.getResource("view/Main Menu.fxml"));
            mainPane = (AnchorPane) loader.load();
            
            Scene scene = new Scene(mainPane);
            primaryStage.setScene(scene);         
            primaryStage.show();
            MainMenuController MMController = loader.getController();
            
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
