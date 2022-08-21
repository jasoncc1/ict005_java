package Assignment4;

import java.util.Scanner; 

public class Problem3 {

	public static void main(String[] args) {
		int number;
		int i = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하시오. :");
		number = in.nextInt();
		
		while(i <=10)
		{
			System.out.print(i*number+ " ");
			i++;
		}
		
		
		
		
	}

}
