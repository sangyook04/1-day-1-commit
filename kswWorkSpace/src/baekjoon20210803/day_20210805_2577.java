package baekjoon20210803;

import java.util.Scanner;

public class day_20210805_2577 {

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		String numbercal = "";
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
		numbercal = Integer.toString(number1 * number2 * number3);
		
		String arr[] = new String[numbercal.length()];
		
		for(int j=0; j<numbercal.length(); j++) {
			arr[j] = numbercal.substring(j, j+1);
		}

		int count[] = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int k = 0; k<=9; k++) {
				
				if(Integer.parseInt(arr[i]) == k) {
					count[k]++;
				}
				
			}
			
		}
		
		for(int p = 0; p<count.length; p++) {
			System.out.println(count[p]);
		}
		
		
	}

}
