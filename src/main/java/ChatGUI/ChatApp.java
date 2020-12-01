package ChatGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatApp extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent Chat= FXMLLoader.load(getClass().getResource("ChatApp.fxml"));
        primaryStage.setTitle("BlackCatChat");
        primaryStage.setScene(new Scene(Chat));
        primaryStage.show();
    }
}
