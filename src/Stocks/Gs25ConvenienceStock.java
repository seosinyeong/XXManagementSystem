package Stocks;

import java.util.Scanner;

public class Gs25 extends Stock implements StockInput{
	
	public Gs25(StockKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Stocks ID: ");
		int id=input.nextInt();
		this.setId(id);
		
		System.out.print("Stocks Item: ");
		String item=input.next();
		this.setItem(item);
		
		char answer='x';
		while(answer!='y'&& answer!='Y' && answer!='N' && answer!='n') {
			System.out.print("Is there a name for the stock?(Y/N)");
			 answer=input.next().charAt(0);
			if(answer =='y'|| answer=='Y') {
				System.out.print("Stocks Name: ");
				String name=input.next();
				this.setName(name);
				break;
			}
			else if(answer=='N'||answer=='n') {
				this.setName("");
				break;
			}
			else {
			}
		}
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
