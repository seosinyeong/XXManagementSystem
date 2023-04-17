package martMangement;

import java.util.ArrayList;
import java.util.Scanner;

public class StocksManager {
	ArrayList<Stocks> stock=new ArrayList<Stocks>();
	Scanner input;
	StocksManager(Scanner input){
		this.input=input;
	}

	public void addStocks() {
		Stocks stocks= new Stocks();
		System.out.print("Stocks ID: ");
		stocks.id=input.nextInt();
		
		System.out.print("Stocks Item: ");
		stocks.item=input.next();
		
		System.out.print("Stocks Name: ");
		stocks.name=input.next();
		stock.add(stocks);

	}
	
	public void deleteStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		int index=-1;
		for(int i=0;i<stock.size();i++) {
			if (stock.get(i).id==stocksID) {
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

		if (stocks.id==stocksID) {
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
					stocks.id=input.nextInt();
				}
				else if(num==2) {
					System.out.println("Stock Item:");
					stocks.item=input.next();				}
				else if(num==3) {
					System.out.println("Stock Name:");
					stocks.name=input.next();				}
				
				else {
					break;
				}//if
			}//while
			break;
		}//if
	
	}//for
}
	
	public void viewStocks() {
		for(int i=0;i<stock.size();i++) {		
			stock.get(i).printInfo();
		}
}
}
