package martMangement;

import java.util.Scanner;

import Stocks.Stock;
import Stocks.StockKind;

public class MiniStopConvenienceStock extends Stock {
	
	public MiniStopConvenienceStock(StockKind kind) {
		super(kind);
	}
	
	protected int companyid;
	protected String companyitem;
	
	
	public void getUserInput(Scanner input) {
		System.out.print("Stocks ID: ");
		int id=input.nextInt();
		this.setId(id);

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
		
		answer='x';
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
