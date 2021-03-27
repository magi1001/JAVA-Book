package 자바의_정석;
import java.util.Scanner;
public class Ex2_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두자리 정수를 하나 입력해주세요>");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); // 문자열을 정수로 출력
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
	}
}
