package 자바의_정석;

class Data_1 {
	int value; // 인스턴스변수
}

class Data_2 {
	int value; // 인스턴스변수

	
	Data_2(int x) { // 매개변수가 있는 생성자.
		value = x;
	}
}

public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();	//Data_1 객체 생성
		Data_2 d2 = new Data_2(10);
	}
}
