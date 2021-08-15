package baekjoon20210810;

import java.util.Scanner;

public class day_20210814_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		String number = sc.next();
		int sum = 0;
		
		for(int i = 0; i < length; i++) {
			sum += Character.getNumericValue(number.charAt(i));
		}
		
		System.out.println(sum);
	}

}

