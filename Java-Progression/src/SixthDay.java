
public class SixthDay {
	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Dacia", "Corvette", "Tesla"}; // first method
		cars[0] = "Ford";
		System.out.println(cars[0]);
		
		String[] names = new String[3]; // second method
		names[0] = "Bob";
		names[1] = "John";
		names[2] = "Michael";
		
		System.out.println("===========================");
		
		/* for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		} */
		
		// FOR-EACH LOOP
		for (String name : names) {
			System.out.println(name);
		}
		
		
		String[][] carName = {
				{"Dacia", "Renault", "Ford"},
				{"BMW", "Lamborghini", "Ferrari"},
				{"Fiat", "Skoda", "Volswaken"}
		};

		System.out.println("===========================");
		
		for (int x=0; x<carName.length; x++) {
			System.out.println();
			for (int y=0;y<carName[x].length; y++) {
				System.out.print(carName[x][y] + " ");
			}
		}
	}
}
