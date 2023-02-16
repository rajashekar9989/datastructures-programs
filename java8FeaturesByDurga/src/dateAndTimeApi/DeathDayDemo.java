package dateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class DeathDayDemo {
	
	public static void main(String[] args) {
		
		LocalDate deathday =LocalDate.of(1998+60, 10, 22);
		
	     LocalDate today =LocalDate.now();
	     
		Period p1 = Period.between(today, deathday);
		
		int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		
		int yyyy=p1.getYears();
		
		
		System.out.printf("Yow will be on the earth only %d DAYS----hURRY uP to do some Importent things",d);
		
		System.out.printf("\n"+"Yow will be on the earth only %d years----hURRY uP to do some Importent things",yyyy);
	}

}
