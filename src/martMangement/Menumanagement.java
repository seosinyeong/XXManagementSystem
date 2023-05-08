package martMangement;
import java.util.Scanner;

public class Menumanagement {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		StockManager stocksManager=new StockManager(input);
	
		int num =-1;
		while(num!=5) {
			System.out.println("***Stocks Management System Menu***");
			System.out.println("1. Add stocks: ");
			System.out.println("2. Delete stocks: ");
			System.out.println("3. Edit stocks: ");
			System.out.println("4. View stocks: ");
			System.out.println("5. Exit ");
			
			num=input.nextInt();
			if(num==1) {
				stocksManager.addStocks();
			}
			else if(num==2) {
				stocksManager.deleteStocks();
			}
			else if(num==3) {
				stocksManager.editStocks();
			}
			else if(num==4) {
				stocksManager.viewStocks();
			}
			else {
				continue;
			}
		}
	}

}

