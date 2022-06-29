package Assignment2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("세 개의 숫자를 입력하시오.:  ");
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if(x > y & x > z)
		{
			System.out.print(1);
		}
		else
		{	
			System.out.print(0);
		}
		
		if(x == z && x==y)
		{
			System.out.print(1);
		}
		else
		{
			System.out.print(" " + 0);
		}
		
		
	}
}

