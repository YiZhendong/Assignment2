/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Caterpillar extends GraphicsProgram {
	/* TODO: You are probably going to want to define some program constants here that
	 * control the size, number, spacing, and color of the body segments. When you do,
	 * delete this comment and replace it with your constants.
	 * 
	 * Remember to add comments describing what each constant does!
	 */	
	
	
	//Tht radius of the segment circle
	private static final int SEGMENT_RADIUS = 30;
	
	//The width of the near segments;
	private static final int WIDTH = 30;
	
	private static final Color fill_color = Color.green;
	private static final Color bound_color = Color.black;
	
	//The (x,y) of the left-up coordinate of the first segment.
	
	private static final int space = 40;
	private static final int x = 0;
	private static final int y = 30;
	
	private static final int x1 = space;
	private static final int y1 = 0;
	
	private static final int x2 = x1 + space;
	private static final int y2 = y;
	
	private static final int x3 = x2 + space;
	private static final int y3 = 0;
	
	private static final int x4 = x3 + space;
	private static final int y4 = y;
	
	private static final int x5 = x4 + space;
	private static final int y5 = 0;
	

	public void run() {
		createCircle(x,y,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		createCircle(x1,y1,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		createCircle(x2,y2,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		/*createCircle(x3,y3,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		createCircle(x4,y4,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		createCircle(x5,y5,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);*/
		/*GOval circle = new GOval(x,y,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		GOval circle1 = new GOval(x1,y1,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		GOval circle2 = new GOval(x2,y2,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		GOval circle3 = new GOval(x3,y3,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		GOval circle4 = new GOval(x4,y4,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);
		GOval circle5 = new GOval(x5,y5,SEGMENT_RADIUS*2,SEGMENT_RADIUS*2);*/
	}


	private void createCircle(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		GOval circle = new GOval(x,y,width,height);
		circle.setFilled(true);
		circle.setFillColor(fill_color);
		circle.setColor(bound_color);
		add(circle);
	}
}
