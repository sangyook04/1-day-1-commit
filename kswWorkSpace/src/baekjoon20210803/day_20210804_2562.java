package baekjoon20210803;

import java.util.Scanner;

public class day_20210804_2562 {

	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int j=0; j<9; j++) {
			arr[j] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
				count = i;
			}
			
		}
		
		System.out.println(max);
		System.out.println(count+1);
		
	}

}
