package Assignment3;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		int year;
		
		Scanner in = new Scanner(System.in);
		System.out.println("년도를 입력하시오. :");
		year = in.nextInt();
		
		if(year%4==0)
		{
			System.out.println("윤년입니다.");

		}
		else
			System.out.println("평년입니다.");
		
		
		
	}

}
