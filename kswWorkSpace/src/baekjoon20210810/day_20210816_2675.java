package baekjoon20210810;

import java.util.Scanner;

public class day_20210816_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int stringCate = sc.nextInt();
			String S = sc.next();
			
			for(int j=0; j<S.length(); j++) {
				
				for(int k = 0; k < stringCate; k++) {
					System.out.print(S.charAt(j));
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}

