package baekjoon20210810;

import java.util.Arrays;
import java.util.Scanner;

public class day_20210822_2750 {
	 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] NArr = new int[N];
		
		for(int i=0; i<N; i++) {
			NArr[i] = sc.nextInt();
		}
		
		Arrays.sort(NArr);
	        
        for (int i : NArr) {
            System.out.println(i);
        }
		
	}
 
}
