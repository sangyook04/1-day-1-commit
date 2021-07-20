package baekjoon20210720;

import java.util.Scanner;

public class day_20210720_2739 {

	public static void main(String[] args) {
		
		int number = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
		
		
	}

}
