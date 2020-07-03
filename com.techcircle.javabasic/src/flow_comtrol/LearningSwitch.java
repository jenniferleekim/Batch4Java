package flow_comtrol;

import java.util.Scanner;

public class LearningSwitch {

	public static void main(String[] args) {
		
//		int day = 78;
//		
//		switch (day) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Invalid number");
//			break;
//		}
	
		
		/*
		double total, num1, num2;
		total = 0;
		Scanner a  = new Scanner(System.in);
		
		System.out.println("Please select operator");
		
		
		
		String operator = a.nextLine();
		
		System.out.println("Please enter number A");
		
		num1 = a.nextDouble();
		
		System.out.println("Please enter number B");
		num2 = a.nextDouble();
		

		
		boolean isInvalid = false;

		switch (operator) {
		case "+":
			total = num1 + num2;
			break;
		case "-":
			total = num1 - num2;
			break;
		case "*":
			total = num1 * num2;
			break;
		case "/":
			total = num1 / num2;
			break;
		default:
			isInvalid = true;
			
			break;
		}
		
		if(isInvalid == true) {
			System.out.println("Invalid operator");
		}else {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + total);
		}
		
		
		
		a.close();
		*/
		
		
		
		char grade = 'P';
		  switch(grade)
		  {
		  	case 'A':
		
		  	case 'B':
		
		  	case 'C':
		
		  	case 'D':
		  System.out.println("Pass");
		  break;
		  	case 'W':
		  System.out.println("Withdraw");
		  break;
		  	case 'I':
		  System.out.println("Incomplete");
		  break;
		      default:
		  System.out.println("Fail");
		  }

		
		
		
		

	}

}
