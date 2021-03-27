package 자바의_정석;

public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); // int형으로 자동으로 변환한뒤 계산을 하기때문에 byte를 붙여주지 않으면 에러가 난다.
		System.out.println(c); // 44가 나오는 이유는 a*b가 byte에 담을 수 있는 정수 값 이상의 수가 나오기 때문이다.
	}
}
