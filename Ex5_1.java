package 자바의_정석;

import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];	// 정수 10개를 갖는 배열 iArr1 
		int[] iArr2 = new int[10];	// 정수 10개를 갖는 배열 iArr2 
		int[] iArr3 = { 100, 95, 80, 70, 60 };	//{}안의 값을 갖는 배열 iArr3 
		char[] chArr = { 'a', 'b', 'c', 'd' }; //{} 안의 문자들을 갖는 배열 chArr

		for (int i = 0; i < iArr1.length; i++) { 
			iArr1[i] = i + 1;
			System.out.print(iArr1[i] + ","); 
		}
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1<math.random<11
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}
}
