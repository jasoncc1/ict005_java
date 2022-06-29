package Assignment2;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int x, y, a, b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하시오. : ");
		
		x = in.nextInt();
		y = in.nextInt();
		
		a = x++; 
		b = --y;
		
				
		System.out.println(a);
		System.out.println(b);
		System.out.println(a * b);
		System.out.println(a * b);


		
		 
		// TODO Auto-generated method stub

	}

}
