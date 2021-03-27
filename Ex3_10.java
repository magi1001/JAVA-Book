package 자바의_정석;

public class Ex3_10 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println("a = " + a); // 오버플로우
		System.out.println("b = " + b); // 롱타입의 형변환을 통해서 제대로된 결과 출력
	}
}
