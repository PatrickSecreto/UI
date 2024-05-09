/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ACER-NITRO
 */
public class addMatrix {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextField myRow;
    @FXML
    private TextField myColumn;
    @FXML
    private Button myButton;
    @FXML
    private Label myResult; 
    
    int rows, columns;
    
    public void switchToAddSubtractMultiply(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddSubtractMatrices.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void submitRowsAndColumns(ActionEvent event){
        try{
            rows = Integer.parseInt(myRow.getText());
            columns = Integer.parseInt(myColumn.getText());
            
            int [][] matrix = new int[rows][columns];
            
            for(int y = 0; y < rows; y++){
                for(int x = 0; x < columns; x++){

                    Random rand = new Random();
                    int rand1 = rand.nextInt(2);

                    // Create a new TextField in each Iteration
                    TextField tf = new TextField();
                    tf.setPrefHeight(50);
                    tf.setPrefWidth(50);
                    tf.setAlignment(Pos.CENTER);
                    tf.setEditable(false);
                    tf.setText("(" + rand1 + ")");


                }
            }
            
        }catch(NumberFormatException e){
            myResult.setText("ERROR: Please enter a valid integer.");
        }
        catch(Exception e){
            myResult.setText("ERROR: Please enter a valid integer.");
        }
    }   
    
}
