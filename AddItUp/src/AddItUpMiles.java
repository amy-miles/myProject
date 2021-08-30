import java.util.Scanner;

public class AddItUpMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		boolean again = true;

		while (again) {
			System.out.print("Enter first number: ");
			int first = in.nextInt();

			System.out.print("Enter second number: ");
			int second = in.nextInt();

			System.out.println(first + " + " + second + " is " + (addTwo(first, second)));
			System.out.print("Would you like to go again? [y]es or [n]o ");
			String answer = in.next().toLowerCase();

			if (answer.equals("n")) {
				again = false;
			}
		}
		System.out.println("Goodbye");

		// System.out.println("");
		in.close();
	}

	/**
	 * This method adds two numbers from user
	 * 
	 * @param num1
	 *            = first
	 * @param num2
	 *            = second
	 * @return = sum of first and second number
	 */
	public static int addTwo(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}

}
