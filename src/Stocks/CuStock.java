package Stocks;

import java.util.Scanner;

public class CuStock extends Stock implements StockInput{
	
	public CuStock(StockKind kind) {
		super(kind);
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
	public void printInfo() {
		String skind ="none";
		switch(this.kind) {
		case Cu:
			skind="Cu.";
			break;
		case Gs25:
			skind="Gs.";
			break;
		case Seveneleven:
			skind="Seven.";
			break;
		case MiniStop:
			skind="Mini.";
			break;
		default:
		}
		System.out.println("kind: "+skind+"company's id"+id+"company's item:"+item+"name:"+name);
	
	
}
}
