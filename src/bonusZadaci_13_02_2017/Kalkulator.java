package bonusZadaci_13_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Kalkulator {

	private static double calculate(String formula) throws Exception {

		formula = formula.replaceAll(" ", "");

		String number = "";
		double result = 0;
		ArrayList<String> numbers = new ArrayList<>();
		ArrayList<String> operators = new ArrayList<>();

		for (int i = 0; i < formula.length(); i++) {

			if (Character.isDigit(formula.charAt(i)) || formula.charAt(i) == '.') {
				number += formula.charAt(i);

			} else {
				numbers.add(number);
				number = "";

				operators.add("" + formula.charAt(i));

			}

			if (formula.length() - 1 == i) {
				numbers.add(number);

			}

		}

		for (int i = 0, j = 0; i < numbers.size(); i++, j++) {

			if (operators.size() > j) {
				if (operators.get(j).equals("+")) {
					if (i == 0) {
						result += (Double.parseDouble(numbers.get(i)) + Double.parseDouble(numbers.get(i + 1)));
					} else {
						result += (Double.parseDouble(numbers.get(i + 1)));
					}

				} else if (operators.get(j).equals("-")) {

					if (i == 0) {
						result -= (Double.parseDouble(numbers.get(i)) + Double.parseDouble(numbers.get(i + 1)));
					} else {
						result -= (Double.parseDouble(numbers.get(i + 1)));
					}

				} else if (operators.get(j).equals("*")) {

					if (i == 0) {
						result += (Double.parseDouble(numbers.get(i)) * Double.parseDouble(numbers.get(i + 1)));
					} else {
						result *= (Double.parseDouble(numbers.get(i + 1)));
					}

				} else if (operators.get(j).equals("/")) {
					
					if (Double.parseDouble(numbers.get(i)) == 0) {
						throw new Exception();
					}
					
					if (i == 0) {
						result += (Double.parseDouble(numbers.get(i)) / Double.parseDouble(numbers.get(i + 1)));
					} else {
						result /= (Double.parseDouble(numbers.get(i + 1)));
					}

				} else if (operators.get(j).equals("^")) {

					if (i == 0) {
						result += Math.pow((Double.parseDouble(numbers.get(i))), 2);
					}

				} else if (operators.get(j).equals("!")) {

					if (i == 0) {
						result += Math.sqrt((Double.parseDouble(numbers.get(i))));
					}

				}
			}

		}
		return result;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String formula;

		while (true) {
			try {
				System.out.print("Unos: ");
				formula = input.nextLine();

				System.out.println("Rezultat: " + calculate(formula));
				break;
			} catch (Exception e) {
				System.out.println("Greska, pokusajte ponovo!!!");
				input.hasNext();
			}
		}

		input.close();

	}

	{

	}

}
