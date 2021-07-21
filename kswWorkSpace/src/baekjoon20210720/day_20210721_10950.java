package baekjoon20210720;

import java.util.Scanner;

public class day_20210721_10950 {

	public static void main(String[] args) {
		
		int numberTest = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		numberTest = sc.nextInt();
		
		for(int i=0; i<numberTest; i++) {
			
			int number1 = 0;
			int number2 = 0;
			
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			
			System.out.println(number1+number2);
		}
		
	}

}
