package 자바의_정석;

public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";

		System.out.println(str.charAt(0) - '0'); // 문자열 "3"을 문자'3'으로 바꾸고 문자'3'을 정수3으로 변환
		System.out.println('3' - '0' + 1); // 문자열 "3"을 정수 3으로 바꾸고 +1
		System.out.println(Integer.parseInt("3") + 1); // 문자열"3"을 정수3으로 바꾸고 1을 더함
		System.out.println("3" + 1); // 문자열"3"에 정수 1을 더함 -> "3" + 1 -> "31"
		System.out.println((char) (3 + '0')); // 정수 3을 문자'3'으로 출력
	}
}
