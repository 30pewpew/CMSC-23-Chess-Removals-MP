package application.controller;

// Import from main
import application.Main;

public class LeaderboardController 
{
	public Main main;
	
	// Setter 
	public void setMain(Main main)
	{
		this.main = main;
	}
	
	// Back Button
	public void BackButton()
	{
		main.startGame();
	}
}