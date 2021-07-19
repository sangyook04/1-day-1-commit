package baekjoon20210714;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class day_20210719_2884 {

	public static void main(String[] args) {
		
		int numberHour = 0; //½Ã
		int numberMinute = 0; //ºÐ
		String alarm = null;
		
		Scanner	sc = new Scanner(System.in);
		
		numberHour = sc.nextInt();
		numberMinute = sc.nextInt();
		
		SimpleDateFormat sdformat = new SimpleDateFormat("H mm"); 
		 
		Calendar cal = Calendar.getInstance();
		 
		cal.set(Calendar.HOUR_OF_DAY , numberHour);
		cal.set(Calendar.MINUTE, numberMinute);
		 
		cal.add(Calendar.MINUTE, -45);
		 
		alarm = sdformat.format(cal.getTime()); 
		System.out.println(alarm); 
		
	}

}
