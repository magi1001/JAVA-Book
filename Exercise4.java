package 자바의_정석;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 1; i < 20; i++) {
			if ((i % 2 != 0) && (i % 3 != 0)) {
				sum1 += i;
			}
		}
		System.out.println(sum1);

		int sum2 = 0;
		int totalSum = 0;
		for (int j = 1; j <= 10; j++) {
			sum2 += j;
			totalSum += sum2;
		}
		System.out.println(totalSum);

		int sum3 = 0;
		int negative = 1;
		int num = 0;

		for (int i = 1; sum3 < 100; i++, negative = -negative) {
			num = negative * i;
			sum3 += num;
			if (sum3 >= 100) {
				break;
			}
		}
		System.out.println(num);

		int x = 0;
		while (x <= 10) {
			int y = 0;
			while (y <= x) {
				System.out.println("*");
				y++;
			}
			System.out.println();
			x++;
		}
		for (int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <= 6; dice2++) {
				if (dice1 + dice2 == 6) {
					System.out.println(dice1 + "+" + dice2 + "=" + (dice1 + dice2));
				}
			}
		}
		
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum=" + sum);

		int value = (int) ((Math.random() * 6) + 1);
		System.out.println("value = " + value);

		int numX = 12345;
		int sumX = 0;

		while (numX > 0) {
			sumX += numX % 10;
			numX /= 10;
		}
		System.out.println("sum = " + sumX);
		int input = 0;
		int count = 0;
		int answer = (int) (Math.random() * 100) + 1;

		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수는 "+ count +"번입니다.");
				break;
			}
		} while (true);
	}

}
