package 자바의_정석;

public class Ex3_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // pi*1000 = 3141.592 / 1000.0 -> 소수점 첫번째에서 반올림한 3142를 1000으로
															// 나눈다
		System.out.println(shortPi); // 3142/1000.0 = 3.142 1000.0을 이용한 이유는 1000으로 나누게 되면 int값으로 인해 3이 출력되기 때문.
	}
}
