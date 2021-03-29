package 자바의_정석;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			int tmp = numArr[0];	// 배열의 [0]번째 부분이 배열의 [n]번째 부분과 100번 섞이도록 한 것.
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}

}
