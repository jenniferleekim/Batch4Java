package flow_comtrol;

public class BasicCalculator {

	public static void main(String[] args) {

		double total, num1, num2;
		num1 = 90;
		num2 = 5;
		total = 0;
		String operator = "*";

//		if (operator == "+") {
//			total = num1 + num2;
//		}
//		
//		
//		if (operator == "-") {
//			total = num1 - num2;
//		}
//		
//		
//		if (operator == "*") {
//			total = num1 * num2;
//		}
//		
//		if (operator == "/") {
//			total = num1 / num2;
//		}

		if (operator == "+") {
			total = num1 + num2;
			
		} else if (operator == "-") {
			
			total = num1 - num2;
			
		} else if (operator == "*") {
			total = num1 * num2;
			
		} else if (operator == "/") {
			total = num1 / num2;
			
		} else {
			System.out.println("Invalid operator");
		}

		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + total);
//		System.out.println(operator );
//		System.out.println(num2 );
//		System.out.println("=" );
//		System.out.println(total);

	}

}
