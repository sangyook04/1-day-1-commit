package kswWorkSpace;

import java.util.Scanner;

public class day_20210710_1008 {

	public static void main(String[] args) {
		
		double number1 = 0;
		double number2 = 0;
		double sumNumber = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		sumNumber = number1 / number2;
		
		System.out.println(sumNumber);

	}

}
