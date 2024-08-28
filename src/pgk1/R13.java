package pgk1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class R13 {

	public static void main(String[] args) {
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime ld1 = LocalDateTime.now();
		System.out.println(ld1.format(dtf1));
	}

}
