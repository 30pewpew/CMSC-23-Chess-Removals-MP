package application.controller;

// Import from main
import application.Main;

public class GameController 
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
		main.openMenu();
	}
	
	// Start Button
	public void StartButton() 
	{
		main.startGame();
	}
	
	// Help Button
	public void RulesButton()
	{
		main.showRules();
	}
	
	// New Game Button
	public void NewgameButton()
	{
		boolean confirm = false;
		confirm = ConfirmationBox.show("Are you sure you want to start a new game?", "Reset Game", "Yes", "No");
		if (confirm)
		{
			main.startGame();
		}
	}
	
	// Scoreboard Button
	public void LeaderboardButton()
	{
		main.showLeaderboard();
	}
	
	// Exit Button
	public void ExitButton()
	{
		System.exit(0);
	}
}