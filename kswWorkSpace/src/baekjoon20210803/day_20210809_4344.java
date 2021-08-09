package baekjoon20210803;

import java.util.Scanner;

public class day_20210809_4344 {

	public static void main(String[] args) {
		
		Scanner	sc = new Scanner(System.in);
 
		int arr[] = new int[sc.nextInt()];
		int arr2[];
		float sum;
		float avg;
		int count;
		float finalNumber;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = 0;
			avg = 0;
			count = 0;
			finalNumber = 0;
			
			arr[i] = sc.nextInt();
			
			arr2 = new int[arr[i]];
			
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = sc.nextInt(); 
				
				sum += arr2[j];
			}
			
			avg = (sum/arr2.length);
			
			for (int k = 0; k < arr2.length; k++) {
			
				if(arr2[k] > avg) {
					count++;
				}
			
			}
			
			finalNumber = (float) (100.0/arr2.length)*count;
			
			System.out.println(String.format("%.3f", finalNumber)+"%");
			
		}//end for

	}

}
