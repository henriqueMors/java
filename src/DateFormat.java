package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //ESTANCIA UMA VARIAVEL PARA UM PADRAO
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //FORMATA COM BASE NO SISTEMA LOCAL
		DateTimeFormatter fmt4 =  DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());

		LocalDate d01 = LocalDate.now(); //SOMENTE A DATA
		LocalDateTime d02 = LocalDateTime.now(); //DATA COM MOMENTO EXATO
		Instant d03 = Instant.now(); //DATAHORA GMT (UK) - GERA COM A DATA  HORARIO DO COMPUTADOR
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); //GERA UMA DATA FORMATADA COM METODO .PARSE
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //GERA UMA DATAHORA FORMATADA
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //TRABALHA COM O IMPORT DATETIMEFORMATER
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

		
		System.out.println("d01 = " + d01.toString()); //.toString GERA NO FORMATO ISO 8601
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		System.out.println("FMT3 = " + fmt3.format(d06));
		System.out.println("FMT3 = " + fmt4.format(d06));
	}
}