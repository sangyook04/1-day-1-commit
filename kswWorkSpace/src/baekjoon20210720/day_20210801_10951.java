package baekjoon20210720;

import java.util.Scanner;

public class day_20210801_10951 {

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			
			System.out.println(number1+number2);
			
		}
		
	}

}
