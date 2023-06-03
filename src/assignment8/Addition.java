package assignment8;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		try {
			System.out.println("Enter number 1: ");
			double num1 =scanner.nextDouble();
			
			System.out.println("Enter number 2: ");
			double num2 =scanner.nextDouble();
			
			double result = num1+num2;
			System.out.println("sum result: "+result);
		}
		catch(Exception e) {
			System.out.println("Error. Please enter number only.");
	
		}
		finally {
			scanner.close();
		}
	}

}
