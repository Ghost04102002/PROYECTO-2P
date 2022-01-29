/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.proyecto_2p_poo;

import com.mycompany.proyecto_2p_poo.rovers.Crateres;
import com.mycompany.proyecto_2p_poo.rovers.Rover;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author samu_
 */
public class ExplorarController implements Initializable {

    @FXML
    private ImageView imgviewer;
    @FXML
    private ComboBox<Rover> comborovers;
    @FXML
    private TextField textfi;
    @FXML
    private TextArea Zonacomandos;
    @FXML
    private Pane panel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try{
            List<Crateres> craters=Crateres.obtenerCrateres();
            for(Crateres i: craters){
                Circle c= new Circle(i.getRadio()/2,Color.TRANSPARENT);
                c.setStroke(Color.RED);
                Label l= new Label(i.getNombre());
                StackPane st= new StackPane();
                st.getChildren().addAll(c,l);
                panel.getChildren().addAll(st);
                st.setLayoutX(i.getCoordsx()/2);
                st.setLayoutY(i.getCoordsy()/2);
               
            }
        }catch (IOException ex){
            System.out.print("Error en el sistema");
        }
        
   
    }    
    
}
