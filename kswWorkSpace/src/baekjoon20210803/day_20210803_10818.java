package baekjoon20210803;

import java.util.Scanner;

public class day_20210803_10818 {

	public static void main(String[] args) {
		
		int number1 = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		
		int arr[] = new int[number1];
		
		for(int j=0; j<number1; j++) {
			arr[j] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		System.out.print(min+" "+max);
		
	}

}
