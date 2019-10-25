import java.util.Scanner;

public class ExceptionDouble {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		do {
			System.out.println("Enter a double number, or q to quit:");
			String userInput = scnr.next();
			if (!userInput.equals("q")) {

				try {
					double inputDouble = Double.parseDouble(userInput);
					System.out.println("The double value representation is: " + inputDouble);
				} catch (NumberFormatException e) {
					System.out.println("That was not a valid double number!");
				}
			}
			else {
				break;
			}
		} while (true);
		scnr.close();
	}
}



