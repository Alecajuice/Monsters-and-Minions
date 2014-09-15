package gui.screens;

import gui.button.Button;
import gui.button.ButtonTemplate;


public class MainMenuScreen extends Screen
{

	public MainMenuScreen()
	{
		this.buttons.add(new Button(new ButtonTemplate(), "hi"));
	}
}
