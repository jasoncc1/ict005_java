package Assignment4;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		int num;
		int sum =0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("100이하의 정수를 입력하시오. :");
		num = in.nextInt();
		
		while (num <= 100)
			{
				sum = sum +num;
				num++;
			}
		System.out.println(sum);
	}

}
