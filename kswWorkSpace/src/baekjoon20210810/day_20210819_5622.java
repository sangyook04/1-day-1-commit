package baekjoon20210810;

import java.util.Scanner;

public class day_20210819_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String number = sc.next();//할머니의 다이얼
		
		String[] numberArr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		int second = 0;
		
		for(int i=0; i<number.length(); i++) {
			
			for(int k=0; k<8; k++) {
				
				if(numberArr[k].indexOf(number.charAt(i)) != -1) {
					
					second += k+3;
					
				}
				
			}
			
		}
		
		System.out.println(second);
		
	}

}

