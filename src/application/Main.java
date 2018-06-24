package application;

// Import dependencies
import java.io.IOException;
//import application.controller.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
//import javafx.scene.image.Image;
import javafx.scene.layout.*;

// Main Class
public class Main extends Application
{
	// Declare the stage
	private Stage primaryStage;
	private AnchorPane mainLayout;
	
	@Override public void start(Stage primaryStage) throws IOException
	{
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("CMSC 23 Chess Removals MP");
		showMainView();
	}

	private void showMainView() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}