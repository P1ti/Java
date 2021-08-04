import java.util.Scanner;

public class EighthDay {
	public static void main(String[] args) {
		// method = a block of code that is executed 
       // whenever it is called upon
		
		Scanner scan = new Scanner(System.in);
		
		String firstName = "Popescu";
		String secondName = "Marian";
		
		fullName(firstName, secondName);
		
		hello();
		hello();
		
		// Calculate the sum of 2 given numbers
		System.out.println("Introdu valoarea lui x: ");
		int x = scan.nextInt();
		System.out.println("Introdu valoarea lui y: ");
		int y = scan.nextInt();
		int calcSum = sum(x, y);
		System.out.println("Suma celor doua numere este: " + calcSum);
	}
	
	static void fullName(String fName, String sName) {
		System.out.println(fName + " " + sName);
	}
	
	static void hello() {
		System.out.println("Hello World");
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
}
