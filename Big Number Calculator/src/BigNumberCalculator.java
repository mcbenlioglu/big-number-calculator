import java.util.ArrayList;
import java.util.Scanner;

public class BigNumberCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String command;
		Scanner scanner = new Scanner(System.in);

//		BigNumber number1 = new BigNumber("3836546");
//		BigNumber number2 = new BigNumber("-5939357");
//		System.out.println(number1.Add(number2));
//		System.out.println(number1.getDigits());
//		System.out.println(number2.getDigits());
//		System.out.println(number1.compareTo(number2));
//		System.out.println(number1.Minimum(number2));
//		for (int i = 0; i < number.getDigits().size(); i++) {
//			System.out.println(number.getDigits().get(i));

		do {

			System.out.print("Enter a command: ");
			command = scanner.nextLine();
			String[] inp = command.split(" ");

			if (inp[0].equals("min")) {
				String firstNumber = inp[1];
				String secondNumber = inp[2];
				BigNumber Fnum = new BigNumber(firstNumber);
				BigNumber Snum = new BigNumber(secondNumber);
				Fnum.Minimum(Snum);
				System.out.println();
			} else if (inp[0].equals("max")) {
				String firstNumber = inp[1];
				String secondNumber = inp[2];
				BigNumber Fnum = new BigNumber(firstNumber);
				BigNumber Snum = new BigNumber(secondNumber);
				Fnum.Maximum(Snum);
				System.out.println();
			} else if (inp[0].equals("sub")) {
				String firstNumber = inp[1];
				String secondNumber = inp[2];
				BigNumber Fnum = new BigNumber(firstNumber);
				BigNumber Snum = new BigNumber(secondNumber);
				System.out.println(Fnum.Substract(Snum));
				
			} else if (inp[0].equals("add")) {

				String firstNumber = inp[1];
				String secondNumber = inp[2];
				BigNumber Fnum = new BigNumber(firstNumber);
				BigNumber Snum = new BigNumber(secondNumber);
				System.out.println(Fnum.Add(Snum));
			}
			else if (inp[0].equals("add3")) {
				String firstNumber = inp[1];
				String secondNumber = inp[2];
				String thirdNumber = inp[3];
				
				BigNumber Fnum = new BigNumber(firstNumber);
				BigNumber Snum = new BigNumber(secondNumber);
				BigNumber Tnum = new BigNumber(thirdNumber);
				BigNumber a = (Fnum.Add(Snum));
				System.out.println(a.Add(Tnum));
			}

		} while (!command.equalsIgnoreCase("Q"));

	}
}
