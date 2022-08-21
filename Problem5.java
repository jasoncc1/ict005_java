package Assignment4;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int i = 0;
		
		
		
		
		System.out.println("숫자를 입력하시오. ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		while(i<=num) {
			sum += i;
			i++;
			
			}
		System.out.println(sum);
		
	}
}
