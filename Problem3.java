package Assignment1;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		int x, y, sum;
		
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오.:  ");
		x = in.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오.:  ");
		y = in.nextInt();
		
		sum = x + y;
		System.out.println(x+"+"+y+"="+sum);
	}

}
