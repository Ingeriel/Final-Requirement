package matunog.java;
import java.util.Scanner;
public class ingeriel {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Input a letter character: ");
	        char letter = scanner.next().toLowerCase().charAt(0);

	        if ((letter >= 'a' && letter <= 'z')) {
	            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
	                System.out.println("The letter " + letter + " is a Vowel.");
	            } else {
	                System.out.println("The letter " + letter + " is a Consonant.");
	            }
	        } else {
	            System.out.println("Invalid Input !!!");
	        }

	        scanner.close();
	    }
	}
