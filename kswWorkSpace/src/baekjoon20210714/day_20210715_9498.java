package baekjoon20210714;

import java.util.Scanner;

public class day_20210715_9498 {

	public static void main(String[] args) {
		
		int examScore = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		examScore = sc.nextInt();
		
		if(examScore >= 90) {
			System.out.println("A");
		} else if(examScore >= 80) {
			System.out.println("B");
		} else if(examScore >= 70) {
			System.out.println("C");
		} else if(examScore >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
