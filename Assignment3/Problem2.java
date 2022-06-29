package Assignment3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		String grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("대문자를 입력하시오. : ");
		grade = scan.next();
		
		String words;
		switch (grade) {
		case "A":
			words = "Excellent";
			break;
		case "B":
			words = "Good";
			break;
		case "C":
			words = "Usually";
			break;
		case "D":
			words = "Effort";
			break;
		case "E":
			words = "Failure";
			break;
		default:
			words = "error";
			break;
		}
		System.out.println(words);
	}

}
