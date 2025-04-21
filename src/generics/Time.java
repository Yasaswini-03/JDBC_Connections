package generics;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getMonth());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.plusDays(3));
		LocalDate ld1 = LocalDate.of(2003, 8, 7);
		System.out.println(ld1);
		System.out.println(ld.isBefore(ld1));
		System.out.println(ld.isAfter(ld1));
//		le = LocalTime.type name = new type();
//		LocalTime lt = LocalTime.of(8, 56);
	}

}
