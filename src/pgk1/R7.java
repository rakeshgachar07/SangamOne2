package pgk1;

public class R7 {

	public static void main(String[] args) {
		String s1 = "";
		
		for(int j=2;j<4;j++) {
			for(int i=1;i < 11; i++) {
				s1 = j + " x " + i + " = " + j*i;
				System.out.println(s1);
			}
			System.out.println();
		}
	
	}

}
