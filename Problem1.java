package Assignment4;

import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
		int num = 0;
		int sum =0;
		int i = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("100이하의 정수를 입력하시오. :");
		num = in.nextInt();
		
		while (i <= num)
			{
				sum = sum +i;
				i++;
			}
		System.out.println(sum);
	}

}
