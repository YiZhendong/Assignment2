/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;

public class BoxesIllusion extends GraphicsProgram {
	/* The number of rows and columns in the grid, respectively. */
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 6;
	
	/* The width and height of each box. */
	private static final double BOX_SIZE = 40;
	
	/* The horizontal and vertical spacing between the boxes. */
	private static final double BOX_SPACING = 10;
	
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight().
	 */
	public static final int APPLICATION_WIDTH = 350;
	public static final int APPLICATION_HEIGHT = 300;

	/*
	 * BLANK_WIDTH represents the space of the most left to the first raw;
	 * BLANK_HEIGHT represents the space of the highest to the first line;
	 */
	public static final int BLANK_WIDTH = 30;
	public static final int BLANK_HEIGHT = 20;
	public void run() {
		/*
		 * use a double loop to create the boxes illusion 
		 */
		for(int i=0;i < NUM_ROWS ;i++){
			for(int j=0;j<NUM_COLS;j++){
				double x = j * (BOX_SIZE+BOX_SPACING)+ BLANK_WIDTH;
				double y = i * (BOX_SIZE+BOX_SPACING)+BLANK_HEIGHT;
				
				GRect rect = new GRect(x,y,BOX_SIZE,BOX_SIZE);
				rect.setFilled(true);
				
				add(rect);
			}
		}
	}
}
