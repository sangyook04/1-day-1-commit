package baekjoon20210720;

import java.util.Scanner;

public class day_20210731_10952 {

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		while(true) {
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			
			if(number1 == 0 && number2 == 0) {
				break;
			} else {
				System.out.println(number1+number2);
			}
		}
		
	}

}
