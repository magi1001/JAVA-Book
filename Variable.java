package justDoIt;

public class Variable {
	// 상수 PI의 값을 선언
	final static double PI = 3.141592;
	// int 값의 최대값을 설정
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {

		int intType = 100;
		double doubleType = 150.5;
		String StringType = "유정렬";

		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(StringType);

		int r = 30;
		System.out.println(r * r * PI);
		// 오버플로우 가장 큰값에서 1이 더해지면서 가장 작은값으로 돌아감. 돌고 돌아가는 구조.
		int a = INT_MAX	;
		System.out.println(a + 1);
		
		int d = 6;
		int b = 2;
		
		System.out.println("d + b = " + (d + b));
		System.out.println("d - b = " + (d - b));
		System.out.println("d * b = " + (d * b));
		System.out.println("d / b = " + (d / b));
		
	}
}
