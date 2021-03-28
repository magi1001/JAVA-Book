package 자바의_정석;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, answer =0;
		answer = (int)(Math.random() * 100) + 1;
		do {
			System.out.println("1과 100사이의 숫자를 입력하세요>");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 도전해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input!=answer);
		System.out.println("정답입니다.");
	}

}
