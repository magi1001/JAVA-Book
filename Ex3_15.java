package 자바의_정석;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' '; // 변수 ch의 초기화
		System.out.printf("문자를 하나 입력하세요.>");

		String input = sc.next();
		ch = input.charAt(0);	// 입력받은 문자열을 문자로 변환

		if ('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다 %n");		
		} else if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) { //소문자 혹은 대문자
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		} else { 	// 그외의 문자
			System.out.println("Err");
		}
	}
}
