import java.util.Scanner;

public class FifthDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double x = 2.4;
		double y = -19;
		
		double max = Math.max(x, y); // Math.max displays the largest number
		double min = Math.min(x, y); // Math.min displays the smallest number
		double abs = Math.abs(y); // Math.abs displays the absolute value
		double sqrt = Math.sqrt(x); // Square root function
		double round = Math.round(x);
		double floor = Math.floor(x); 
		
		double a;
		double b;
		double c;
		
		System.out.println("Enter side a");
		a = scan.nextDouble();
		
		System.out.println("Enter side b");
		b = scan.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("Hypotenuse is " + c);
		scan.close();
	}
}
