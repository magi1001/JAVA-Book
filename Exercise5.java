package 자바의_정석;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise5 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);

		int[][] arr2 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 }, };
		int total = 0;
		float avg = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
				avg = total / (float) (arr2.length * arr2[0].length);
			}

		}
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j]; // i번째의 숫자와 무작위 j번째의 위치를 바꾼다.
			ballArr[j] = tmp;
		}
		System.arraycopy(ballArr, 0, ball3, 0, 3);

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String char[]로 변환 }
			for(int j = 0; j<question.length; j++) {
				int idx = (int) (Math.random()*question.length);
				char tmp = question[j];
				question[j] = question[idx];
				question[idx] = tmp;
			}
			
			System.out.printf("Q%d. %s의 답을 입력하세요>", i + 1, new String(question));
			String answer = sc.nextLine();

			// trim()으로 answer의 좌우 공백을 제거한 후 , equals로 word[i]와 비교
			if (words[i].equals(answer.trim()))
				System.out.println("맞았습니다.%n%n");
			else
				System.out.println("틀렸습니다.%n%n");
		}
	}
}
