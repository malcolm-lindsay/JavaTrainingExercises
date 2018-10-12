public class CalculatorApp {

	public static void main(String[] args) {

		double number1 = 3.0;
		double number2 = 2.0;
		String operator = "+";

		if (operator == "+") {
			System.out.println(number1 + number2);
		}

		else if (operator == "-") {
			System.out.println(number1 - number2);
		} else if (operator == "/") {
			System.out.println(number1 / number2);
		} else if (operator == "*") {
			System.out.println(number1 * number2);
		} else {
			System.out.println("Error");
		}
	}
}
