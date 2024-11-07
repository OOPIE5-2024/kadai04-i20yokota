package kadai04;

import java.awt.Color;

public class CurrentColor {
	int red = 0;
	int green = 0;
	int blue = 0;
	final int VAL = 128;
	Color curColor = (new Color(red, green, blue));
	
	
	public void changeRed() {
		if(red >= 255)
			red = 0;
		else
			red += VAL;
		if(red>255) red=255;
			
		updateColor();
		
	}
	public void changeGreen() {
		if(green >= 255)
			green = 0;
		else
			green += VAL;
		if(green>255) green=255;
		updateColor();
		
	}
	public void changeBlue() {
		if(blue >= 255)
			blue = 0;
		else
			blue += VAL;
		if(blue>255) blue=255;
		updateColor();
	}
	
	
	void updateColor() {
		curColor = new Color(red,green,blue);
	}
	
	
	public Color getColor() {
		
		return curColor;
	}
	
}


