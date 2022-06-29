package Assignment1;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) { 
			
			double yard, cm;
			Scanner in = new Scanner(System.in);
			
			System.out.print("yard를 입력하시오. : ");
			yard = in.nextDouble();
			
			cm = yard * 91.44;
			System.out.println(yard + "yrad = " + Math.round(cm*10)/10.0 +"cm");
		
	}

}
