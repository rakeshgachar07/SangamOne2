package pgk1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class R11 {

	public static void main(String[] args) throws IOException {
		String fName1 = "tables2.txt";
		String[] arr1 = fName1.split("[.]");
		String fName2 = arr1[0] + "_out.txt";
		File f1 = new File(fName1);
		FileWriter fw1 = new FileWriter(fName2);
		Scanner sc1= new Scanner(f1);
		String[] arr2 = new String[1];
		String line1 = sc1.nextLine();
		arr2 = line1.split(",");	
		String s1 = "";
		int start = Integer.parseInt(arr2[0]);
		int end = Integer.parseInt(arr2[1]);
		
		for(int j=start;j<(end +1);j++) {
			for(int i=1;i < 11; i++) {
				s1 = j + " x " + i + " = " + j*i;
				System.out.println(s1);
				fw1.write(s1);
				fw1.write("\n");
			}	
			System.out.println();
			fw1.write("\n");
		}
		fw1.close();
	
	}

}
