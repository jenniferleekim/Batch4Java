package flow_comtrol;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {

//		int count = 2;
//		
//		int total = 4;

//		if (count > 3) {
//			total = 0;
//			count = 10;
//		}else {
//			//total = total + count;
//			total +=count;
//		}

//		if ((count == 4) || !(count < 4)) {
//			//false          true  
//			
//			total = 100;
//		} 
//		
//		
//		System.out.println(total);

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("What is the temperature?");
//		int temperature = scanner.nextInt();
//
//		System.out.println("Is sunny today?");
//		boolean sunny = scanner.nextBoolean();
//
//		if (temperature > 90) { // int temperature
//			if (sunny) { // boolean sunny
//				System.out.println("Beach");
//			} else {
//				System.out.println("Movie");
//			}
//		} else {
//			if (sunny) {
//				System.out.println("Tennis");
//			} else {
//				System.out.println("Soccer");
//			}
//		}
//
//		scanner.close();

//		int score;
//		char grade = 'F';
//
//		System.out.println("Enter your score :");
//		Scanner scanner = new Scanner(System.in);
//
//		score = scanner.nextInt();
//		if (score > 100 || score < 0) {
//
//			System.out.println("Invalid score");
//
//		} else {
//			if (score >= 90 && score <= 100) {
//				grade = 'A';
//			} else if (score >= 80 && score < 90) {
//				grade = 'B';
//			} else if (score >= 70 && score < 80) {
//				grade = 'C';
//			} else if (score >= 60 && score < 70) {
//				grade = 'D';
//			} else if (score < 60) {
//				grade = 'F';
//			}
//		
//			System.out.println("Score = " + score);
//			System.out.println("Grade = " + grade);
//			
//
//		}
//		
//		scanner.close();

		// Jenny

//		int time;
//		System.out.println("What time is it?");
//		Scanner scanner = new Scanner (System.in);
//		time = scanner.nextInt();
//		if (time < 12 && time >= 5) {
//			System.out.println("Good Morning");
//		}else if (time >= 12 && time <= 17) {
//			System.out.println("Good Afternoon");
//		}else if (time >= 17 && time <= 24) {
//			System.out.println("Good Evening");
//		}
//		scanner.close();

		// Dulce
//		int time = 19;
//
//		if (time < 12 && time > 5) {
//			System.out.println("goodmorning");
//		}
////		int time = 13;
//		if (time <= 17 && time >= 12) {
//			System.out.println("goodafternoon");
//		}
////		int time = 23;
//		if (time >=17 && time < 24) {
//			System.out.println("goodevening");
//
//		}
		
		//Task2
//		double n1 = -1.0, n2 = -4.5, n3 = 5.3, largestNumber;
//		
//		if (n1 >= n2) {
//			if (n1 >= n3) {
//				largestNumber = n1;
//			}else {
//				largestNumber = n3;
//			}
//		}else {
//			if(n2 >= n3) {
//				largestNumber = n2;
//			}else {
//				largestNumber = n3;
//			}
//		}
//		
//		System.out.println("Largest number is = "+ largestNumber);
		
		
		double num1 = -1.0;
		double num2 = -4.5;
		double num3 = -5.3;
	    if( num1 >= num2 && num1 >= num3) {
	        System.out.println(num1+" is the largest Number");
	        }
	    else if (num2 >= num1 && num2 >= num3) {
	        System.out.println(num2+" is the largest Number");
	        }
	    else {
	    	System.out.println(num3+" is the largest Number");	
	    	}
		

	}
}
