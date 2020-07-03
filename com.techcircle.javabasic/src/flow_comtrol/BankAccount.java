package flow_comtrol;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		double overdrawnPenalty = 8.0;
		double interestRate = 0.02;
		double balance;

		System.out.println("Enter your checking accont balance : $");

		Scanner scanner = new Scanner(System.in);

		balance = scanner.nextDouble();

		System.out.println("Original balance $" + balance);

//		if (balance >= 0) {
//			balance = balance + (interestRate * balance)/12 ; 
//					
//		}else {
//			balance = balance - overdrawnPenalty;
//			
//		}

		balance = (balance >= 0) ? balance + (interestRate * balance) / 12 : balance - overdrawnPenalty;

		System.out.println("Your new balance is $" + balance);

		scanner.close();
	}

}
