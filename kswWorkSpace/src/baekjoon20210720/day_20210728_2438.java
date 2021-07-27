package baekjoon20210720;

import java.util.Scanner;

public class day_20210728_2438 {

	public static void main(String[] args) {
		
		int numberTest = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		numberTest = sc.nextInt();
		
		for(int i=1; i<=numberTest; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		
	}

}
