
/*
    IN JAVA MVC,
    1. CONTROLLER IS PRESENT , JUST FOR HANDLING EVENTS
    2. MODEL IS PRESENT AND HANDLES ALL LOGIC AND BACK-END PROCESSING
 */


package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("scrabble.fxml"));
        primaryStage.setTitle("Scrabble points Generator");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }


    /*
        name of controller is written as
          format --> package_name.javaClassName

          package.controllerJavaName ,,, in our case ,, gui.LoginController
     */
}
