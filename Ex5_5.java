package 자바의_정석;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개의 정수 값을 저장하는 배열 생성

		for (int i = 0; i < ball.length; i++) // 1~45를 각 배열의 요소에 저장
			ball[i] = i + 1;

		int tmp = 0;
		int j = 0;
		for (int i = 0; i < 6; i++) { // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔 값을 섞는다
			j = (int) (Math.random() * 45) + 1; //0번째부터 5번째 요소까지 모두 6개만 바꾼다.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}
