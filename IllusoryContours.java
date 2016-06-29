/* TODO: A program that show the illusory contour
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class IllusoryContours extends GraphicsProgram {
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight(), which return the *exact* width and height of the window.
	 */
	public static final int APPLICATION_WIDTH = 300;
	public static final int APPLICATION_HEIGHT = 300;
	public static final int CIRCLE_DIAMETER = 100;
	public static double x1=0,y1=0,x2=0,y2=0,x3=0,y3=0,x4=0,y4=0;
	public void run() {
		getCenter();
		showCircle();
		showRect();
	}

	/*
	 * 得到四个圆心
	 * x代表圆的外切长方形的左上角的x坐标，而非圆心的x坐标
	 * y代表的远的外切长方形的左上角的y坐标，而非圆心的y坐标
	 */
	private void getCenter() {
		x1 = getWidth() - CIRCLE_DIAMETER;
		y1 = getHeight() - CIRCLE_DIAMETER;
		x2 = 0;
		y2 = 0;
		x3 = getWidth() - CIRCLE_DIAMETER;
		y3 = 0;
		x4 = 0;
		y4 = getHeight() - CIRCLE_DIAMETER;
		
	}
	
	private void showCircle(){
		GOval circle1 = new GOval(x1,y1,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle2 = new GOval(x2,y2,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle3 = new GOval(x3,y3,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle4 = new GOval(x4,y4,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		circle1.setFilled(true);
		circle1.setFillColor(Color.black);
		add(circle1);
		circle2.setFilled(true);
		circle2.setFillColor(Color.black);
		add(circle2);
		circle3.setFilled(true);
		circle3.setFillColor(Color.black);
		add(circle3);
		circle4.setFilled(true);
		circle4.setFillColor(Color.black);		
		add(circle4);
	}

	private void showRect() {
		// TODO Auto-generated method stub
		double x5 = CIRCLE_DIAMETER/2;
		double y5 = CIRCLE_DIAMETER/2;
		double rectWidth = getWidth() - CIRCLE_DIAMETER;
		double rectHeight = getHeight() - CIRCLE_DIAMETER;
		GRect rect = new GRect(x5,y5,rectWidth,rectHeight);
		rect.setFilled(true);
		rect.setFillColor(Color.white);
		rect.setColor(Color.white);
		add(rect);
	}
}
