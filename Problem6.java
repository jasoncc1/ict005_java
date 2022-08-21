package Assignment4;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		double Base, Height, Triangle_width;
		char answer;
		Scanner in = new Scanner(System.in);
		for (int i=1; i<5; i++){
		System.out.println("Base = ");
		Base = in.nextDouble();
		System.out.println("Height = ");
		Height = in.nextDouble();
		System.out.println(Base*Height/2);

		
		System.out.println("Continue?");
		answer = in.nextLine().charAt(0);
		if (answer == 'y' || answer == 'Y') continue;
		}
	}

}
