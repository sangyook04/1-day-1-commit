package baekjoon20210720;

import java.util.Scanner;

public class day_20210722_8393 {

	public static void main(String[] args) {
		
		int number = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		for(int i=number-1; i>=0; i--) {
			number = number + i;
		}
		
		System.out.println(number);
		
	}

}
