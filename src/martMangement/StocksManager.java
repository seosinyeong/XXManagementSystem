package martMangement;

import java.util.Scanner;

public class StocksManager {
	Stocks stocks;
	Scanner input;
	StocksManager(Scanner input){
		this.input=input;
	}

	public void addStocks() {
		stocks= new Stocks();
		System.out.print("Stocks ID: ");
		stocks.id=input.nextInt();
		
		System.out.print("Stocks Item: ");
		stocks.item=input.next();
		
		System.out.print("Stocks Name: ");
		stocks.name=input.next();
	}
	
	public void deleteStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		if (stocks==null) {
			System.out.println("the stocks has not been registered");
			return;
		}
		if (stocks.id==stocksID) {
			stocks = null;
			System.out.println("the stocks is deleted");
		}
	}
	
	public void editStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		if (stocks.id==stocksID) {
			stocks = null;
			System.out.println("the stock is to be edited is"+ stocksID);
			return;
		}
	}
	
	public void viewStocks() {
		System.out.print("Stocks ID: ");
		int stocksID =input.nextInt();
		if (stocks.id==stocksID) {
		stocks.printInfo();
	}
}
}
