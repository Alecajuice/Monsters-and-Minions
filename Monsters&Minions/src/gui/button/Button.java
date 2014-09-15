package gui.button;


import gui.GuiElement;

import java.awt.Point;

import org.lwjgl.input.Mouse;

public class Button extends GuiElement
{
	private ButtonTemplate template;
	private String text;
	
	public Button(ButtonTemplate template, String text)
	{
		this.template = template;
		this.text = text;
	}
	
	public boolean isClicked()
	{
		return (this.mouseOnElement() && Mouse.isButtonDown(0));
	}
}
