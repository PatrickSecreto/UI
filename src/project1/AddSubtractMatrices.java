
package project1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AddSubtractMatrices {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void switchToScene2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void addMatrix(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("addMatrix.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void subtractMatrix(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("subtractMatrix.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void multiplyMatrix(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("multiplyMatrix.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
