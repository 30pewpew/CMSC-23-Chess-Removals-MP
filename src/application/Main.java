package application;

import java.awt.geom.Rectangle2D;
// Required import dependencies
import java.io.IOException;

import application.controller.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

// Main class
public class Main extends Application 
{
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) 
	{
		this.primaryStage = primaryStage;
		// Starts chess app menu
		openMenu();
	}
	
	// Open game menu
	public void openMenu() 
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MainView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			MainController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("CMSC 23 Chess Removals");
			primaryStage.setResizable(false);
			primaryStage.show();
			javafx.geometry.Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
	        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	// Start game
	public void startGame() 
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/NewGameView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			GameController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("CMSC 23 Chess Removals");
			primaryStage.setResizable(false);
			primaryStage.show();
			javafx.geometry.Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
	        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	// Show rules
	public void showRules()
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/GameRules.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			RulesController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("CMSC 23 Chess Removals");
			primaryStage.setResizable(false);
			primaryStage.show();
			javafx.geometry.Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
	        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	// Show leaderboard
	public void showLeaderboard()
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/LeaderBoardView.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			LeaderboardController controller  = loader.getController();
			controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("CMSC 23 Chess Removals");
			primaryStage.setResizable(false);
			primaryStage.show();
			javafx.geometry.Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
	        primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
	        primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	// End Game
	public void gameOver()
	{
		try 
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/GameOver.fxml"));
			AnchorPane apane = (AnchorPane) loader.load();
			
			//GameController controller  = loader.getController();
			//controller.setMain(this);

			Scene scene = new Scene(apane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("CMSC 23 Chess Removals");
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
