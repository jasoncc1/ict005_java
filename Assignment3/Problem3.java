package Assignment3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하시오. :");
		number = in.nextInt();
		
		if(number == 1)
		{
			System.out.println("dog");
		}
		else if(number == 2)
		{
			System.out.println("cat");
			
		}
		else if(number == 3)
		{
			System.out.println("chick");
		}
		else 
		{
			System.out.println("I don't know. ");
		}
		
		
		
	}

}
