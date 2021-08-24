package baekjoon20210810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class day_20210824_10989 {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++){
			sb.append(arr[i]).append('\n');
		}
 
		System.out.println(sb);
		
	}
 
}
