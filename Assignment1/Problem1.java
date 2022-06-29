package Assignment1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kor, mat, eng, sum, avg;
		
		System.out.print("kor ");
		kor = in.nextInt();
		
		System.out.print("mat ");
		mat = in.nextInt();
		
		System.out.print("eng ");
		eng = in.nextInt();
		
		sum = mat + kor + eng;
		System.out.println("sum " + sum);
		
		avg = sum/3;
		System.out.println("avg " + avg);
	
		
		
		
		

	}

}
