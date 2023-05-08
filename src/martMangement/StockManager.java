package martMangement;

import java.util.ArrayList;
import java.util.Scanner;

import Stocks.Stock;
import Stocks.StockKind;

public class StockManager {
	ArrayList<Stock> stocks=new ArrayList<Stock>();
	Scanner input;
	StockManager(Scanner input){
		this.input=input;
	}

	public void addStocks() {
		int kind=0;
		Stock stock;
		while(kind!=1&&kind!=2) {
			System.out.print("1 for Cu ");
			System.out.print("2 for Gs25 ");
			System.out.print("3 for Ministop ");
			System.out.print("Select num 1 , 2 or 3for Stock kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				stock= new Stock(StockKind.Cu);
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else if(kind == 2) {
				stock= new Gs25(StockKind.Gs25);						
				stocks.add(stock);
				stock.getUserInput(input);
				break;
			}
			else if(kind == 3) {
				stock= new MiniStopConvenienceStock(StockKind.MiniStop);						
				stocks.add(stock);
				stock.getUserInput(input);
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
		for(int i=0;i<stocks.size();i++) {
			if (stocks.get(i).getId()==stocksID) {
				index=i;
				break;
			}
		}
		if(index>=0) {
			stocks.remove(index);
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
		
		for(int i=0;i<stocks.size();i++) {	
			Stock stock =stocks.get(i);

		if (stock.getId()==stocksID) {
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
					stock.setId(id);
				}
				else if(num==2) {
					System.out.println("Stock Item:");
					String item=input.next();	
					stock.setItem(item);
				}
				else if(num==3) {
					System.out.println("Stock Name:");
					String name=input.next();				
					stock.setName(name);
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
		System.out.println("# of registered students:"+ stocks.size());
		for(int i=0;i<stocks.size();i++) {		
			stocks.get(i).printInfo();
		}
}
}
