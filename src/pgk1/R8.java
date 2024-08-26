package pgk1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R8 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("tables1.txt");
		Scanner sc1= new Scanner(f1);
		String s1 = "";
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
