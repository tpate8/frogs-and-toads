package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.fxml.FXMLLoader; 
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.PasswordField;


public class Main extends Application {
	Scene scene1, scene2,scene3;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label user_id=new Label("User ID");  
	    Label password = new Label("Password");  
	    TextField tf=new TextField();  
	    PasswordField pf=new PasswordField();  
	    pf.setPromptText("Enter Password");  
	    Button b = new Button("Submit");  
	    GridPane root = new GridPane();  
	    root.addRow(0, user_id, tf);  
	    root.addRow(1, password, pf);  
	    root.addRow(5, b);  
	    Scene scene=new Scene(root,300,200);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("PLEASE LOGIN");  
	    primaryStage.show();  
	    b.setOnAction(e -> primaryStage.setScene(scene2)); 
	    Label label2= new Label("SELECT YOUR GAME");
		Button button2= new Button("FROGS AND TODS");
		Button button3= new Button("RIVER AND FARMER");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		button3.setOnAction(e -> primaryStage.setScene(scene3));
		VBox layout2= new VBox(20);
		layout2.getChildren().addAll(label2, button2,button3);
		scene2= new Scene(layout2,600,350);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
