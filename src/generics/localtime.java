package generics;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localtime {
	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
		System.out.println(lt.plusHours(5));

		LocalTime lt1 = LocalTime.of(5, 50, 30);
		System.out.println(lt1);
		System.out.println(lt.isBefore(lt1));
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
//		LocalDateTime ldt1 = LocalDateTime.of(ldt, lt1)
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.toLocalTime());
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd-MM-yy  hh:mm:ss");
		System.out.println(dtm.format(ldt));
//		DateTimeFormatter d1 = DateTimeFormatter.ofLocalizedDate(16);
//		System.out.println(d1);
				
		
	}

}
