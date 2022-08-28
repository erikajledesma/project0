// Erika Ledesma
// Programming Assignment 1
// 3-10-22

package homework3;
import java.util.Scanner;

public class printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String input;
		
		while (true) {
			System.out.println("Enter string here: ");
			input = scnr.nextLine();
			
			if (input.equals("done") || input.equals("Done") || input.equals("d")) {
				break;
			}
			for(int i = (input.length() - 1); i >= 0; i--) { 
				System.out.print(input.charAt(i));
			}
			System.out.println("");
		}

	}
		
}



