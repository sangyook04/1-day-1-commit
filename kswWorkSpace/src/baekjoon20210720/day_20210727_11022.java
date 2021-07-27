package baekjoon20210720;

import java.util.Scanner;

public class day_20210727_11022 {

	public static void main(String[] args) {
		
		int numberTest = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		numberTest = sc.nextInt();
		
		for(int i=1; i<=numberTest; i++) {
			
			int number1 = 0;
			int number2 = 0;
			
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			
			System.out.println("Case #"+i+": "+number1+" + "+number2+" = "+(number1+number2));
		}
		
	}

}
