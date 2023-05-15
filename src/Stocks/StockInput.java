package Stocks;

import java.util.Scanner;

public interface StockInput {
	
	public int getId();
	public void setId(int id);
	public void setName(String name);
	public void setItem(String item);
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
