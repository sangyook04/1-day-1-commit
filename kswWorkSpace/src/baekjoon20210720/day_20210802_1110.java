package baekjoon20210720;

import java.util.Scanner;

public class day_20210802_1110 {

	public static void main(String[] args) {
		
		int number1 = 0;
		String number2 = "";
		String number1String = "";
		String number1String3 = "";
		int numberResult = 0;
		int count = 1;
		
		Scanner	sc = new Scanner(System.in);
		
		number1 = sc.nextInt();
		numberResult = number1;
		
		number1String = Integer.toString(number1);
		
		if(number1 < 10) {
			number1String = "0"+number1String;
		}
		
			
		while(true) {
			
			number1String3 = Integer.toString(Integer.parseInt(number1String.substring(0, 1)) + Integer.parseInt(number1String.substring(1, 2)));
			
			if(Integer.parseInt(number1String3) < 10) {
				number1String3 = "0"+number1String3;
			}
			
			number2 = number1String.substring(1, 2) + number1String3.substring(1,2);
			
			if(Integer.parseInt(number2) == numberResult) {
				break;
			} else {
				count++;
			}
			
			number1String3 = number2;
			number1String = number1String3;
			
		}
		
		System.out.println(count);
		
	}

}
