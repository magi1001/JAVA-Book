package 자바의_정석;

public class Ex3_14 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf(" \"abc\" == \"abc\"  ? %b%n", "abc" == "abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2 == "abc"); // 객체가 다르기 때문에 false값
		System.out.printf("str1.equals(\"abc\") ? %b%n" , str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n" , str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n" , str2.equals("abc"));//대문자이기 때문에 falser값
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n" , str1.equalsIgnoreCase("ABC"));
		//대소문자를 구별하지 않고 비결하고 싶다면 equals 대신 equalsIgnoreCase()를 사용하면 된다.
		
	}
}
