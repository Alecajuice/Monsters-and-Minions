package gui;

import java.awt.Point;

import org.lwjgl.input.Mouse;


public class GuiElement
{
	private Point pos;
	private int width, height;
	private double rotationDeg;
	
	public boolean mouseOnElement()
	{
		Point mousePos = new Point(Mouse.getX(), 720-Mouse.getY());
		//x' = x \cos \theta - y \sin \theta\,,
		//y' = x \sin \theta + y \cos \theta\,.
		return (pos.x >= mousePos.getX() && pos.x <= mousePos.getX()+width && pos.y >= mousePos.getY() && pos.y <= mousePos.getY()+height) ? true : false;
	}
}
