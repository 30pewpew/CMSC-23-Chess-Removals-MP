package application.controller;

// Import from main
import application.Main;

public class RulesController 
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