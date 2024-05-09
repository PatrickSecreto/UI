
package project1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ACER-NITRO
 */
public class Project1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setTitle("ComPanion CoE");

            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
