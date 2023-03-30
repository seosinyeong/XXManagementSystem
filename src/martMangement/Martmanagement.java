package martMangement;

import java.util.Scanner;

public class Martmanagement {

	public static void main(String[] args) {
		int num  =0;
		Scanner input =new Scanner(System.in);
		
		while(num!=6) {
			System.out.println("1. Add stocks");
			System.out.println("2. Delete stocks");
			System.out.println("3. Edit stocks");
			System.out.println("4. View stocks");
			System.out.println("5. Show stocks");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num=input.nextInt();
			if (num==1) {
				addStocks();
			}
			else if (num==2) {
				deleteStocks();
			}
			else if (num==3) {
				editStocks();
			}
			else if (num==4) {
				viewStocks();
			}
			else {
				continue;
			}
			
		}
	}
	public static void addStocks() {
		Scanner input =new Scanner(System.in);	
		
		System.out.print("Stocks ID: "); 
		int stocksID=input.nextInt();
		
		System.out.print("Stocks Item: ");
		String stocksItem=input.next();
		System.out.println(stocksItem);

		System.out.println("stocksName:");
		String stocksName=input.next();
		System.out.println(stocksName);
	}
	
	
	public static void deleteStocks() {
		Scanner input =new Scanner(System.in);
		System.out.print("Stocks ID: ");
		int stocksID = input.nextInt();
	}
	public static void editStocks() {
		Scanner input =new Scanner(System.in);
		System.out.print("Stocks ID: ");
		int stocksID = input.nextInt();
	}
	
	public static void viewStocks() {
		Scanner input =new Scanner(System.in);
		System.out.print("Stocks ID: ");
		int stocksID = input.nextInt();
	}
	
}


