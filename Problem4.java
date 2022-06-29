package Assignment2;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		int x, y, a, b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("민수의 키를 입력하시오. :");
		x = in.nextInt();
		System.out.println("민수의 몸무게를 입력하시오. :");
		y = in.nextInt();
		
		System.out.println("기영의 키를 입력하시오. :");
		a = in.nextInt();
		System.out.println("기영의 몸무게를 입력하시오. :");
		b = in.nextInt();
		
		if(x > a && y > b)
		{
			System.out.print(1);
		}
		System.out.print(0);

		


		
	}

}
