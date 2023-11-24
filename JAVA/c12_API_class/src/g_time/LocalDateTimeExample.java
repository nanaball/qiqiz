package g_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		// @since 1.8
		// 시간 정보를 쉽게 다룰 수 있도록 추가된 class
		// LocalDate, LocalTime, LocalDateTime
		
		LocalDate toDay = LocalDate.now();
		LocalTime present = LocalTime.now();
		System.out.println(toDay);
		System.out.println(present);
		
		LocalDate birthDay = LocalDate.of(83, 02, 07);
		System.out.println(birthDay);

		LocalDate birthDay1 = LocalDate.of(1983, 02, 07);
		System.out.println(birthDay1);
		
		LocalTime birthTime = LocalTime.of(02, 02, 10);
		birthTime = LocalTime.of(02,02,10,123456789);
		System.out.println(birthTime);
		
		System.out.println(toDay.getYear());
		System.out.println(toDay.getMonthValue());
		System.out.println(toDay.getDayOfMonth());
		System.out.println(toDay.getDayOfWeek());
		System.out.println(toDay.getDayOfYear());
		
		System.out.println(present.getHour() + ":" + present.getMinute() + ":" + present.getSecond());
		
		
		// 1년 전 
		LocalDate target = toDay.minusYears(1);
		System.out.println(target);
		
		// 10년 후
		target = toDay.plusYears(10);
		System.out.println(target);
		
		// 5달전
		target = toDay.minusMonths(5);
		System.out.println(target);
		
		// 20일전
		target = toDay.minusDays(20);
		System.out.println(target);
		
		// 10시간 전
		LocalTime targetTime = present.minusHours(10);
		System.out.println(targetTime);
		
		// 5시간 후 
		targetTime = present.plusHours(5);
		System.out.println(targetTime);
		
		// 10분 전
		targetTime = present.minusMinutes(10);
		System.out.println(targetTime);
		
		// 30초 후 
		targetTime = present.plusSeconds(30);
		System.out.println(targetTime);
		
		// 현재 날짜와 시간
		LocalDateTime targetDateTime = LocalDateTime.now();
		System.out.println(targetDateTime);
		
		targetDateTime = LocalDateTime.of(target, targetTime);
		targetDateTime = LocalDateTime.of(2023, 11, 24, 12, 11, 23);
		System.out.println(targetDateTime);
	
		targetDateTime = targetDateTime.withYear(2024).withMonth(10).withDayOfMonth(5).
										withHour(13).withMinute(30).withSecond(20);
		System.out.println(targetDateTime);
		
		// 지정된 패턴을 이용하여 문자열 생성 
		// 패턴 지정 클래스 
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a KK시 mm분 ss초");
		String time = targetDateTime.format(pattern);
		System.out.println(time);
		
		
		// 문자열을 시간 정보로 변환
		// 따로 패턴을 지정하지 않으면 기본 타입으로 전달해야함
		targetDateTime = LocalDateTime.parse("1983-02-07T10:11:10");
		System.out.println(targetDateTime);
		
		// input type="date", "2023-10-10"
		LocalDate date = LocalDate.parse(
				"2023년10월10일",
				DateTimeFormatter.ofPattern("yyyy년MM월dd일")
				);
		System.out.println(date);
		
		// 열심히 써도 localdate라 날짜만 나옴 그래서 localdatetime을 써야함
		date = LocalDate.parse(
				"2023년 11월 24일 12시 27분 30초",
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")
				);
		System.out.println(date);
		
		// ====>
		LocalDateTime dateTime = LocalDateTime.parse(
				"2023년 11월 24일 12시 27분 30초",
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")
				);
		System.out.println(dateTime);
		
		
		/*
		 // Time 정보 누락 오류로 parsing 실패
		dateTime = LocalDateTime.parse(
			"2023년11월24일",
			DateTimeFormatter.ofPattern("yyyy년MM월dd일")
		);
		System.out.println(dateTime);
		*/
		
			
	}

}
