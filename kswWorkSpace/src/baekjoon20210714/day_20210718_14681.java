package baekjoon20210714;

import java.util.Scanner;

public class day_20210718_14681 {

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if(number1 > 0 && number2 > 0) {
			System.out.println("1");
		}else if(number1 < 0 && number2 > 0) {
			System.out.println("2");
		}else if(number1 < 0 && number2 < 0) {
			System.out.println("3");
		}else if(number1 > 0 && number2 < 0) {
			System.out.println("4");
		}
		
	}

}
