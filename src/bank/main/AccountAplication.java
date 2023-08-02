package bank.main;


import java.util.InputMismatchException;
import java.util.Scanner;

import bank.method.FunctionsAccount;
import custom.exception.SaldoInsuficienteException;

public class AccountAplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter Account Data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			String holder = sc.next();
									
			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw Limit: ");
			Double withdrawLimit = sc.nextDouble();
			

			FunctionsAccount app = new FunctionsAccount(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter Amount For Withdraw: " );
			Double withdraw = sc.nextDouble();
			app.setWithdraw(withdraw);
			app.setBalance(balance, withdraw);
			System.out.println("New Balance: " + app.getBalance());
			}
		catch (InputMismatchException e) {
			System.out.println("Invalid Date Format, you need to input a number!");
		}
		
		catch (SaldoInsuficienteException e) {
			System.out.println("Attention: " + e.getMessage());
		}

		
		catch (IllegalArgumentException e) {
			System.out.println("Attention: " + e.getMessage());
		}

			sc.close();
			
					
		
		
	}

}
