package com.gl.money;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
	Transaction transaction = new Transaction();
	
	Scanner sc = new Scanner(System.in);
	int noOfDenomination;
	System.out.println("enter the size of currency denomination");
	noOfDenomination = sc.nextInt();
	System.out.println("enter the currency denomination value");
	int[]array = new int[noOfDenomination];
	for(int i=0;i<noOfDenomination;i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("enter the amount you want to pay");
	int amount = sc.nextInt();
    transaction.bubbleSort(array);
	transaction.noOfNotes(array, amount);
       sc.close();
}

}
