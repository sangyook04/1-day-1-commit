package baekjoon20210714;

import java.util.Scanner;

public class day_20210714_1330 {

	public static void main(String[] args) {
		
		int firstNumber = 0;
		int secondNumber = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		firstNumber = sc.nextInt();
		secondNumber = sc.nextInt();
		
		if(firstNumber < secondNumber) {
			System.out.println("<");
		} else if(firstNumber > secondNumber) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
		
	}

}
