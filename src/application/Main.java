package application;

// Import dependencies
import java.io.IOException;
import application.controller.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

// Main Class
public class Main extends Application
{
	// Declare the stage
	private Stage primaryStage;
	
	// Override for start
	@Override public void start(Stage primaryStage)
	{
		// Setting stage as the primary stage
		this.primaryStage = primaryStage;
		
		// Load FXML and respective controllers
		// openmain();
	}
	
	public void openMain()
	{
		// Try catch statement
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/Start.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			//MainController controller = loader.getController();
			//controller.setMain(this);
			
			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("CMSC 23 Chess Removals MP");
			primaryStage.getIcons().add(new Image("file:icon.png"));
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}