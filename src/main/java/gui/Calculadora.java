package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application  {
	
	public static void main(String args[]){ 
	      Launch(args); 
	} 
	
	@Override
	public void start(Stage window) throws Exception {
		** vb = new VBox();
		window.setTitle("Calculadora");
		
		vb.getChildren().add(new Calculator());
		Scene sc = new Scene(***, 270, 270);
		window.setScene(sc);
		window.show();
	}
	
}
