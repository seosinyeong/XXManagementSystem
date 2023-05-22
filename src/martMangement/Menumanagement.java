package martMangement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menumanagement {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		StockManager stockmanager=new StockManager(input);
		selectMenu(input,stockmanager);
	}
		
		public static void selectMenu(Scanner input,StockManager stockmanager) {
			int num =-1;
			while(num!=5) {
				try {		
					showMenu();
				
				num=input.nextInt();
				switch(num) {
				case 1:				
					stockmanager.addStocks();
					break;

				case 2:
					stockmanager.deleteStocks();
					break;

				case 3:
					stockmanager.editStocks();
					break;

				case 4:
					stockmanager.viewStocks();
					break;
				default:
					continue;
					
				}
				}
				catch(InputMismatchException e) {
					System.out.println("Please put an integer between 1 and 5!");
					if(input.hasNext()) {
						input.next();
					}
					num=-1;
				}
			}

		}
		
	
	public static void showMenu() {
		System.out.println("***Stocks Management System Menu***");
		System.out.println("1. Add stocks: ");
		System.out.println("2. Delete stocks: ");
		System.out.println("3. Edit stocks: ");
		System.out.println("4. View stocks: ");
		System.out.println("5. Exit ");
		System.out.println("Select one number between 1-5: ");

	}

}

