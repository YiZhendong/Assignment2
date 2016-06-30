/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class TricolorFlag extends GraphicsProgram {
	/* The width and height of the flag. Many flags have an aspect ratio of 3:2 and
	 * our choice of constants here assumes this. Feel free to change these constants
	 * if you're drawing a flag with a different aspect ratio.
	 */
	private static final double FLAG_WIDTH  = 300;
	private static final double FLAG_HEIGHT = 200;
	
	private static final double x = 100;
	private static final double y = 50;
	
	/**
	 * The program is divided to two methods;
	 */
	public void run() {
		drawFlag();
		signName();
	}

	/**
	 * the mothod is to draw flag,and it draws three rect
	 */
	private void drawFlag() {
		drawRect(x,y,FLAG_WIDTH/3,FLAG_HEIGHT,Color.black);
		drawRect(x+FLAG_WIDTH,y,FLAG_WIDTH/3,FLAG_HEIGHT,Color.yellow);
		drawRect(x+FLAG_WIDTH*2,y,FLAG_WIDTH,FLAG_HEIGHT,Color.red);
	}

	/**
	 * draw a rect
	 * @param x     The x coordinate of the upper-left corner of the box .
	 * @param y		The y coordinate of the upper-left corner of the box .
	 * @param width		The width of the rect.
	 * @param height	The height of the rect.
	 */
	private void drawRect(double x, double y, double width, double height,Color color) {
		GRect rect = new GRect(x,y,width,height);
		rect.setFilled(true);
		rect.setFillColor(color);
		add(rect);
	}

	private void signName() {
		// TODO Auto-generated method stub
		
	}
}
