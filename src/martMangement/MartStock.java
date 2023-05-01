package martMangement;

import java.util.Scanner;

import Stock.Stocks;

public class MartStock extends Stocks {
	
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
}
