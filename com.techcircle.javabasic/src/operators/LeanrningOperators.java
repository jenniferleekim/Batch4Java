package operators;

import java.util.Scanner;

public class LeanrningOperators {

	public static void main(String[] args) {
		
		//The Arithmetic operators
		
//		int a = 10; 
//		int b = 7;
//		
//		int c = a-b;
//		
//		System.out.println(a%b);
//		
//		
//		a++; //postfix
//		++a; //prefix
//		
//		c--;
//		
//		System.out.println("This is result of c : "+c);
//
//		System.out.println("a = "+a);
		
		// Relational operators
		
		
		byte byteValueA = 4 ;
		byte byteValueB = 8 ;
		
		boolean result 		   = byteValueA == byteValueB;
		
		boolean resultNotEqual = byteValueA != byteValueB;
		
		
		
		
		
//		System.out.println("result = "+ !result);
//		System.out.println("resultNotEqual = "+resultNotEqual);
		
// Logical operator
		
		 // && 
		 // ||
		 // !
		
//		
//		byte byteValueC = 4 ;
//		byte byteValueD = 8 ;
//
//		
//		
//		System.out.println("resultNotEqual = "+resultNotEqual);
//		boolean resultNotEqual2 = byteValueC != byteValueD;
//		
//		System.out.println("resultNotEqual2 = "+resultNotEqual2);
//		
//		
//		boolean and = resultNotEqual && result;
//						//true            false
//		
//		System.out.println("Line 64"+ and);
//		
//		
//		
//		boolean A = true;
//		boolean B = true;
//		boolean C = false;
//		
//		System.out.println(!A);
		
		
////		boolean D =  A && C;
//		
//		boolean D =  A || C;
//		
//		System.out.println("result line 74 "+D);

		
		int num1 = 30;
		int num2 = 5;
		
		
//		num1 +=num2; // num1 = num1 + num2;
//		num2 -=num1; 
//		num2 = num2 - num1;
//		System.out.println(num2);

		num1/=num2;// num1= num1 / num2;
		
		System.out.println(num1);
		
		num1*=num2;
		System.out.println(num1);
		
		
		
		
		
		// variable x = (expression) ? true value : false value;
		
		
		
		int num3 = (num1 > num2) ? 300 : 0;
		
		
		System.out.println(num3);
		
		
		
		String techCircle = (num2 < num3 ) ?"Dulce":"Jenny";
		
		System.out.println(techCircle);
		
		
		
		
		
		final double pi = 3.14;
		
//		
//		pi = 9090;
//		
		
		System.out.println(pi);
		
		
		
		int x = 23;
		int y = 7;
		int remainder= x%y;
		
		System.out.println(remainder);
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter a number!");
		
		int num6 = scan.nextInt();
		
		System.out.println("Here is your number : "+ num6);
		
		scan.close();
		
		
		
		

	}

}
