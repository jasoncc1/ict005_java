package Assignment3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int x;
		
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하시오.   : ");
		
		x = in.nextInt();
		
		if(x > 0)
		{
			System.out.println("Plus");
		}
		else if(x == 0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Minus");
		}
	}
		

}
