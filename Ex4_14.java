package 자바의_정석;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요.(예1234567)>");

		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합 :" + sum);
	}

}
