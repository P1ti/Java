
public class FirstDay {
	public static void main(String[] args) {
		String salut = "Buna"; // string declaration
		System.out.println("Hello World"); // display a string
		System.out.println(salut); // if I use println, the next string will be displayed on a new line
		
		int x = 13; // integer declaration
		int y = 4;
		int multiply = x * y; // I made a multiply operation, but there are more operations such as +, - , *, /
		
		System.out.println(multiply);
		
		salut("Piti", 17, 30);
		
		// sum(12, 23); => nothing will happen, because I should save the value in a variable
		int valoare = sum(12, 23);
		System.out.println(valoare);
		
		String numeComplet = numeComplet("Berbecea", "Petrica");
		System.out.println("!Numele complet este: " + numeComplet);
	}
	
	// Function and methods
	
	public static void salut(String nume, int a, int b) { // public means that you can access from anywhere, 
						   // static means that the function doesn't change his value
		                  // void means that the function will turn no result
		System.out.println("Buna seara, " + nume + "!");
		System.out.println("Am " + a + " ani si sunt nascut in data de " + b + " Mai.");
	}
	
	public static int sum(int a, int b) { // int means that the function should return an integer
		int sum = a + b;
		return sum;
	}
	
	public static String numeComplet(String nume, String prenume) {
		String numeComplet = nume + " " + prenume;
		return numeComplet;
	}
}

	//////////
   ////////// Basis of OOP Programming in next file
  //////////  
