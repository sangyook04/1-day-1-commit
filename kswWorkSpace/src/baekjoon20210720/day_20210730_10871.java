package baekjoon20210720;

import java.util.Scanner;

public class day_20210730_10871 {

	public static void main(String[] args) {
		
		int numberN = 0;
		int numberX = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		numberN = sc.nextInt();
		numberX = sc.nextInt();
		
		int numberA[] = new int[numberN];
		
		for (int j=0; j<=numberN; j++) {
			
			numberA[j] = sc.nextInt();
			
			if(numberA[j] < numberX) {
				System.out.print(numberA[j]+" ");
			}
		}
		
	}

}
