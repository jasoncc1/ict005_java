package Assignment1;

import java.util.Scanner;

public class Problem4 { // 1yard = 91.44cm
	public static void main(String[] args) {
		double x, y, z,sum;
		int avg;
		Scanner in = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력하시오. :");
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		
		sum = x+y+z;
		avg = (int)sum / 3;
		System.out.println("sum = "+ sum );
		System.out.print("avg = " + avg);

		


	}

}
