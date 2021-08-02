import java.util.Scanner;
import javax.swing.*;

public class ThirdDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* System.out.println("What's your name? ");
		String name = scan.nextLine();
		
		System.out.println("How old are you? ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is your favorite food? ");
		String food = scan.nextLine();
		
		System.out.println("Hello " + name + ".");
		System.out.println("You are " + age + " years old.");
		System.out.println("Your favorite food is " + food + "."); */
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		if (age > 65 && age < 80) {
			JOptionPane.showMessageDialog(null, "Too old");
		} else if (age > 18 && age < 65) {
			JOptionPane.showMessageDialog(null, "Approved");
		} else if (age < 18) {
			JOptionPane.showMessageDialog(null, "Try when you will grow up");
		} else {
			JOptionPane.showMessageDialog(null, "Invalid age");
		}
	}
}
