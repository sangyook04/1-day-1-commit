package baekjoon20210810;

import java.util.Scanner;

public class day_20210821_2292 {
	 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		int range = 2;	
	    
	    if (N == 1) {
			System.out.print(1);
		} else {
			while (range <= N) {	
				range = range + (6 * count);	
				count++;	
			}
			System.out.print(count);
		}
		
	}
 
}
