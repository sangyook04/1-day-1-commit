package baekjoon20210810;

import java.util.Scanner;

public class day_20210827_1979 {
	 
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt(); //M이상
        int N = sc.nextInt(); //N이하
        
        int result = 0;
        for(int i=M; i<N; i++){
            if(isPrime(i)) result++;
        }
        System.out.println(result);
        
    }
 
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;            
        }
        return true;
    }
    
}
