package 자바의_정석;

public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;	
		int b = 2_000_000; 
		long c = a*b;
		System.out.println(c); // int*int의 연산을 수행했으므로 int 범위 내의 정수가 나오고 결과적으로 -1454759936가 나옴
	}

}
