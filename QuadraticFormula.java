/* TODO: A program that the roots of the quadratic equation
 */
import acm.program.*;

public class QuadraticFormula extends ConsoleProgram {
	public int a,b,c;
	public double discriminant;
	public double root1,root2;
	public void run() {
		getNumber();
		getRoots();
	}

	private void getNumber() {
		println("This program needs three intengers:");
		a = readInt("Enter first int a:");
		b = readInt("Enter second int b:");
		c = readInt("Enter third int c:");
	}

	private void getRoots() {
		getDiscriminant();
		showRoots();
	}

	private double getDiscriminant() {
		discriminant = b*b - 4*a*c;
		return discriminant;
	}

	private void showRoots() {
		if(discriminant < 0){
			println("There are no real roots");
		}else if(discriminant ==0 ){
			root1 = (-b)/(2*a)
			println("this is one root:"+ root1);
		}else {
			root1 = (-b+ Math.sqrt(discriminant))/(2*a);
			root2 = (-b- Math.sqrt(discriminant))/(2*a);
		}
	}
}