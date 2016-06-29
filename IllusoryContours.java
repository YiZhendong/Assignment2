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
	public static final int CIRCLE_DIAMETER = 50;
	public int x1,y1,x2,y2,x3,y3,x4,y4;
	public void run() {
		getCenter();
		showCircle();
		showRect();
	}

	private void getCenter() {
		// TODO Auto-generated method stub
		double x1 = getWidth() - CIRCLE_DIAMETER;
		double y1 = getWidth() - CIRCLE_DIAMETER;
		double x2 = CIRCLE_DIAMETER;
		double y2 = CIRCLE_DIAMETER;
		double x3 = getWidth() - CIRCLE_DIAMETER;
		double y3 = CIRCLE_DIAMETER;
		double x4 = CIRCLE_DIAMETER;
		double y4 = getWidth() - CIRCLE_DIAMETER;
	}
	
	private void showCircle(){
		GOval circle1 = new GOval(x1,y1,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle2 = new GOval(x2,y2,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle3 = new GOval(x3,y3,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		GOval circle4 = new GOval(x4,y4,CIRCLE_DIAMETER,CIRCLE_DIAMETER);
		
	}

	private void showRect() {
		// TODO Auto-generated method stub
		
	}
}
