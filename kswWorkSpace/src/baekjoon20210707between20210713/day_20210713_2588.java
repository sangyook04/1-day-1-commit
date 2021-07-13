package baekjoon20210707between20210713;

import java.util.Scanner;

public class day_20210713_2588 {

	public static void main(String[] args) {
		
		int firstNumber = 0;
		String secondNumber = "";
		
		Scanner	sc = new Scanner(System.in);
		
		firstNumber = sc.nextInt();
		secondNumber = sc.next();
		
		System.out.println(firstNumber*Integer.parseInt(secondNumber.substring(2,3)));
		System.out.println(firstNumber*Integer.parseInt(secondNumber.substring(1,2)));
		System.out.println(firstNumber*Integer.parseInt(secondNumber.substring(0,1)));
		System.out.println(firstNumber*Integer.parseInt(secondNumber));

	}

}
