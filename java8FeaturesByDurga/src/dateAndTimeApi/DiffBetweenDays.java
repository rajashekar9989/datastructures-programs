package dateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class DiffBetweenDays {

	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1998, 10,22 );
		
		LocalDate now =LocalDate.now();
		
		Period p = Period.between(birthday, now);
		
		System.out.printf("Age is  %d Years  %d  Months %d Days",+p.getYears(),p.getMonths(),p.getDays());

	}

}
