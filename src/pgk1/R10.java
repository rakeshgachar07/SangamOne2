package pgk1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R10 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("tables2.txt");
		Scanner sc1= new Scanner(f1);
		String[] arr1 = new String[1];
		String line1 = sc1.nextLine();
		arr1 = line1.split(",");	
		String s1 = "";
		int start = Integer.parseInt(arr1[0]);
		int end = Integer.parseInt(arr1[1]);
		
		for(int j=start;j<(end +1);j++) {
			for(int i=1;i < 11; i++) {
				s1 = j + " x " + i + " = " + j*i;
				System.out.println(s1);
			}	
			System.out.println();
		}
	
	}

}
