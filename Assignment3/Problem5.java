package Assignment3;

import java.util.Scanner;

public class Problem5 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int age;
		
			
			System.out.println("성별을 입력하세요(M/F) : ");
	        char gen =in.nextLine().charAt(0);   
			
			System.out.println("나이를 입력하시오.  : ");
			age = in.nextInt();
			
			if (age >= 18 && gen == 'M')
			{
				System.out.println("Man");
			}
			else if (age >= 18 && gen == 'F')
			{
				System.out.println("Woman");
			}
			else if (age <= 18 && gen == 'M')
			{
				System.out.println("boy");
			}
			else if (age <= 18 && gen == 'F')
			{
				System.out.println("girl");
			}


			
	}

}
