package baekjoon20210720;

import java.util.Scanner;

public class day_20210802_1110 {

	public static void main(String[] args) {
		
		int number1 = 0;
		String number1String = "";
		int numberResult = 0;
		int count = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		
		number1String = Integer.toString(number1);
		
		if(number1 < 10) {
			number1String = "0"+number1String;
		}
		
		//while(sc.hasNextInt()) {
		while(true) {
			
			System.out.println(Integer.parseInt(number1String.substring(0, 1)) + Integer.parseInt(number1String.substring(1, 2)));
			
			if(number1 == numberResult) {
				
				System.out.println(count);
				
				break;
			}
			
			count++;
			
		}
		
	}

}
