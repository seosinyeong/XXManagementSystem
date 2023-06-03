package assignment8;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		try {
			System.out.print("Enter number: ");
			int number =scanner.nextInt();
			
			if(number % 2!=0){
			throw new MyException("Odd number is not allowed.");
			}
		
			System.out.println("Number is "+number);
		}
		catch(MyException e) {
			System.out.println("Exception. "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Not allowed. Enter Number. ");
		}
		finally {
			scanner.close();
		}
	}
}
			