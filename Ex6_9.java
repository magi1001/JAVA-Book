package 자바의_정석;

class MyMath2 {
	long a, b;

	// 인스턴스 변수 a,b만을 이용하여 작업하므로 매개변수가 필요없다.
	// a,b는 인스턴수 변수
	long add() {
		return a + b;
	}

	long subtract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	long divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;
	}

	static long subtract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(long a, long b) {
		return a / (double) b;
	}
}

public class Ex6_9 {
	public static void main(String[] args) {
		// 클래스 메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2(); // MyMath 안의 메소드를 사용하기 위해서 인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
