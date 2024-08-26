package pgk1;

import java.util.Scanner;

public class R9 {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		String s1 = "";
		System.out.println("Enter start and end Value");
		int start = sc1.nextInt();
		int end = sc1.nextInt();
		
		for(int j=start;j<(end +1);j++) {
			for(int i=1;i < 11; i++) {
				s1 = j + " x " + i + " = " + j*i;
				System.out.println(s1);
			}
			System.out.println();
		}
	
	}

}
