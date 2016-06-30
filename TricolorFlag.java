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
	
	//the first rect (x,y)
	private static final double x = 100;
	private static final double y = 50;
	private static final double width = FLAG_WIDTH/3;
	private static final double height = FLAG_HEIGHT;
	
	//the second rect(x1,y1)
	private static final double x1 = x+FLAG_WIDTH/3;
	private static final double y1 = y;
	private static final double width1 = FLAG_WIDTH/3;
	private static final double height1 = FLAG_HEIGHT;
	
	//the third rect(x2,y2)
	private static final double x2 = x1+FLAG_WIDTH/3;
	private static final double y2 = y;
	private static final double width2 = FLAG_WIDTH/3;
	private static final double height2 = FLAG_HEIGHT;
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
		drawRect(x,y,width,height,Color.black);
		drawRect(x1,y1,width1,height1,Color.yellow);
		drawRect(x2,y2,width2,height2,Color.red);
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
