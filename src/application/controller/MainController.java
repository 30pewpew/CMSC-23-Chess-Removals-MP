package application.controller;

// Import from main
import application.Main;

public class MainController 
{
	private Main main;

	// Setter
	public void setMain(Main main) 
	{
		this.main = main;
	}
	
	// Start Button
	public void StartButton() 
	{
		main.startGame();
	}
	
	// Exit Button
	public void ExitButton() 
	{
		System.exit(0);
	}
}