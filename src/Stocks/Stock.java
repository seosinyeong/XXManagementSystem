package Stocks;

import java.util.Scanner;

public class Stock {
	protected StockKind kind = StockKind.Cu;
	protected int id;
	protected String item;
	protected String name;
	
	public Stock() {
	}
	
	public Stock(StockKind kind) {
		this.kind=kind;
	}


	public Stock(int id, String item) {
		this.id= id;
		this.item=item;

	}
	
	public Stock(int id, String item, String name) {
		this.id= id;
		this.item=item;
		this.name=name;
	
	}
	
	public Stock(StockKind kind,int id,String item,String name) {
		this.kind=kind;
		this.id=id;
		this.item=item;
		this.name=name;
	}
	
	public StockKind getKind() {
		return kind;
	}


	public void setKind(StockKind kind) {
		this.kind = kind;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void  printInfo() {
		System.out.println("id:"+id+"  item:"+item+"  name:"+name);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Stocks ID: ");
		int id=input.nextInt();
		this.setId(id);
		
		System.out.print("Stocks Item: ");
		String item=input.next();
		this.setItem(item);
		
		System.out.print("Stocks Name: ");
		String name=input.next();
		this.setName(name);

	}

}

