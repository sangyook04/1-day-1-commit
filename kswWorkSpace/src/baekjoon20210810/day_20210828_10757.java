package baekjoon20210810;

import java.math.BigInteger;
import java.util.Scanner;

public class day_20210828_10757 {
		 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        BigInteger sum = a.add(b);
        
        System.out.println(sum.toString());
		
	}
    
}
