package inheritance;

import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {
	
	Font font;
	Color blackColor;
	Color whiteColor;
	Color grayColor;
	Color backgroundColor;
	
	public void init() {
		//The Font is Arial size, 18 and is italicized
		font = new Font("Arial",Font.ITALIC,18);
		//Some colors are predefined in the Color class
		blackColor = Color.black;
		whiteColor = Color.white;
		//Colors can be created using Red, Green, Blue values
		grayColor = new Color(128,128,128);
		//Set the background Color of the applet
		setBackground(whiteColor);
	}
	
	public void stop() {
	}
	
	/**
	* This method paints the shapes to the screen
	*/
	public void paint(Graphics graph) {
		//Set font
		graph.setFont(font);
		//Create a title
		graph.drawString("Draw Shapes",90,20);
		//Set the color for the first shape
		graph.setColor(blackColor);
		// Draw a rectangle using drawRect(int x, int y, int width, int height)
		graph.drawRect(120,120,120,120);
		// This will fill a rectangle
		graph.fillRect(115,115,90,90);
		//Set the color for the next shape
		graph.setColor(blackColor);
		//Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
		graph.fillArc(110,110,50,50,0,360);
		//Set color for next shape
		graph.setColor(grayColor);
		//Draw another rectangle
		graph.drawRect(50,50,50,50);
		// This will fill a rectangle
		graph.fillRect(50,50,60,60);
	}
}
