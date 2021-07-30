
public class SecondDay {
	public static void main(String[] args) {
		// How to declare an array ?
		String[] names= {"Piti", "Daniel", "Ioan", "Marcu"};
		
		// How to print some values ?
		// first value:
		System.out.println(names[0]);
		// third value
		System.out.println(names[2]);
		
		names[2] = "Gabriela"; // third value changed with Gabriela
		System.out.println(names[2]);
		
		// Loop through an array
		for (int i=0; i<names.length; i++) {
			System.out.println("Elementul de pe pozitia " + i + " este " + names[i]);
		}
		
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	// Java Methods
	public static void metodaPrincipala(String[] args) {
		String mesaj = mesajAvertizare("empty");
		System.out.println(mesaj);
	}
	
	public static String mesajAvertizare(String mesaj) {
		int n = 1;
		if (n == 1) {
			mesaj = "Buna";
			System.out.println(mesaj);
		}
		return mesaj;
	}
}
