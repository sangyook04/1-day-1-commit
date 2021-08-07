package baekjoon20210803;

import java.util.Scanner;

public class day_20210807_1546 {

	public static void main(String[] args) {
		
		int number1 = 0;
		float avg = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		
		float arr[] = new float[number1];
		
		for(int j=0; j<number1; j++) {
			arr[j] = sc.nextInt();
		}
		
		float max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		for(int k=0; k<arr.length; k++) {
			arr[k] = arr[k] / max * 100;
			avg += arr[k];
		}
		
		System.out.println(avg/arr.length);
		
	}

}
