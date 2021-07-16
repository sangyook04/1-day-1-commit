package baekjoon20210714;

import java.util.Scanner;

public class day_20210716_2753 {

	public static void main(String[] args) {
		
		int year = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		year = sc.nextInt();
		
		if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
	}

}
