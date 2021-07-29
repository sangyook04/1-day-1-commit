package baekjoon20210720;

import java.util.Scanner;

public class day_20210729_2439 {

	public static void main(String[] args) {
		
		int numberTest = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		numberTest = sc.nextInt();
		
		for ( int i = 1 ; i <= numberTest ; i++ ){
			for( int j = 1 ; j <= numberTest-i ; j++ ) {
				System.out.print(" ");
			}
			for( int k = 1 ; k <= i ; k++ ){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
