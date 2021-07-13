package baekjoon20210707between20210713;

import java.util.Scanner;

public class day_20210711_10869 {

	public static void main(String[] args) {
		
		//A+B, A-B, A*B, A/B(¸ò), A%B(³ª¸ÓÁö)
		
		int number1 = 0;
		int number2 = 0;
		int calNumber1 = 0;
		int calNumber2 = 0;
		int calNumber3 = 0;
		int calNumber4 = 0;
		int calNumber5 = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		calNumber1 = number1 + number2;
		calNumber2 = number1 - number2;
		calNumber3 = number1 * number2;
		calNumber4 = number1 / number2;
		calNumber5 = number1 % number2;
		
		System.out.println(calNumber1);
		System.out.println(calNumber2);
		System.out.println(calNumber3);
		System.out.println(calNumber4);
		System.out.println(calNumber5);

	}

}
