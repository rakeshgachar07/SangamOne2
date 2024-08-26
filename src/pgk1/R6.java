package pgk1;

import java.util.ArrayList;
import java.util.List;

public class R6 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<Integer> lucky = new ArrayList<>();
		List<Integer> unlucky = new ArrayList<>();
		int count = 100;
		for(int i=0; i < count; i ++) {
			list1.add("C");
		}
		for(int i=0; i < count; i ++) {
			list1.set(i, "O"); 
		}
		for(int i=1; i < count; i+=2) {
			list1.set(i, "C"); 
		}
		for(int j=2; j < count; j++) {
			for(int i=j; i < count; i+=(j+1)) {
				String ele = list1.get(i);
				if(ele.equals("O")) {
					list1.set(i, "C"); 
				}
				else {
					list1.set(i, "O"); 
				}		
			}	
		}
		for(int i=0;i < list1.size();i++) {
			String ele = list1.get(i);
			if(ele.equals("O")) {
				lucky.add(i+1);
			}
			else {
				unlucky.add(i+1);
			}
		}
		System.out.println(lucky + "are the lucky Prisoner who are going to be released today");
		System.out.println(unlucky + "are the unlucky Prisoner who are going to be released after 4 weeks");
	}

}
