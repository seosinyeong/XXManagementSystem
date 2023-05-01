package martMangement;

import java.util.ArrayList;
import java.util.Scanner;

import Stock.Stocks;

public class StocksManager {
	ArrayList<Stocks> stock=new ArrayList<Stocks>();
	Scanner input;
	StocksManager(Scanner input){
		this.input=input;
	}

	public void addStocks() {
		int kind=0;
		Stocks stocks;
		while(kind!=1&&kind!=2) {
			System.out.print("1 for Convenience ");
			System.out.print("\t2 for Mart ");
			System.out.println("Select num for Student Kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				stocks= new Stocks();
				stocks.getUserInput(input);
				stock.add(stocks);
				break;
			}
			else if(kind == 2) {
				stocks= new MartStock();						
				stock.add(stocks);
				stocks.getUserInput(input);
				break;
			}
			else {
				System.out.print("Select num for Student Kind between 1 and 2: ");
			}
		}

	}
	
	public void deleteStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		int index=-1;
		for(int i=0;i<stock.size();i++) {
			if (stock.get(i).getId()==stocksID) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			stock.remove(index);
			System.out.println("the stock "+stocksID+" is deleted");
		}
		
		else {
			System.out.println("the stock has not been registered");
			return;
		}
	
	}
	
	public void editStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		
		for(int i=0;i<stock.size();i++) {	
			Stocks stocks =stock.get(i);

		if (stocks.getId()==stocksID) {
			int num =-1;
			while(num!=5) {
				System.out.println("***Stocks Management System Menu***");
				System.out.println("1. Edit Id: ");
				System.out.println("2. Edit Item: ");
				System.out.println("3. Edit name: ");
				System.out.println("4. Exit ");
				
				num=input.nextInt();
				
				if(num==1) {
					System.out.println("Stock ID:");
					int id=input.nextInt();
					stocks.setId(id);
				}
				else if(num==2) {
					System.out.println("Stock Item:");
					String item=input.next();	
					stocks.setItem(item);
				}
				else if(num==3) {
					System.out.println("Stock Name:");
					String name=input.next();				
					stocks.setName(name);
					}
				else {
					break;
				}//if
			}//while
			break;
		}//if
	
	}//for
}
	
	public void viewStocks() {
		System.out.print("Stocks ID: ");
		int stockId =input.nextInt();
		System.out.println("# of registered students:"+ stock.size());
		for(int i=0;i<stock.size();i++) {		
			stock.get(i).printInfo();
		}
}
}
