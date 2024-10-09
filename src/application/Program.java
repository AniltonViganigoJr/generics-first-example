package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintService<String> printService = new PrintService<>();
		
		System.out.print("How many values?");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			printService.addValue(sc.next());
		}
		
		printService.print();
		System.out.println("\nFirst:" + printService.first());
		sc.close();
	}
}