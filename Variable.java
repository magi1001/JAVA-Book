package 복습;

public class Variable {
	public static void main(String[] args) {
		//변수
		// 기본형(primitive type)
		int a = 1; // 정수를 담는 변수
		double b = 0.1; // 실수를 담는 변수 float 보다 범위가 크다.
		float c = 0.1f; // 실수를 담는 변수 double보다 작고 정밀, 빠르다. 뒤에 f를 붙인다.
		long d = 1l; // 정수를 담는 변수 int를 초과하는 범위의 정수는 long을 이용하고 l을 뒤에 붙인다.
		boolean e = true; // ture or false 를 담는 논리변수
		char f = 'f';
		char u = '\u0041'; // 유니코드를 통한 문자출력도 가능
		// 이외에도 byte, short, 등이 있으나 범위가 작아 잘쓰이지 않음.		
		
		// 참조형(reference type)
		// 참조형 기본형을 제외한 모든 변수 (String, System 등)
		// 객체의 주소를 저장
		String g = "강백호";
		
		/*
		 * 변수(variable) - 하나의 값을 저장하기 위한 공간
		 * 상수(constant) - 한 번만 값을 저장할 수 있는 공간. 상수의 이름은 항상 대문자로 하며 단어는'_'를 이용해 구분한다.
		 * 상수는 한번 지정된 값을 변경할 수 없다. ex) final int MAX = 100;, MAX = 200;(불가)
		 * 리터럴(literal) - 그 자체로 값을 의미하는 것 
		 */
		
		// 변수의 초기화
		/*
		 *  boolean b = false;
		 *  char grade = '';
		 *  int c = 0;
		 *  long l = 0; (자동으로 0L로 변환)
		 *  float f = 0; (0.0f로 변환)
		 *  double d = 0; (0.0으로 변환)
		 *  String s1 = null;
		 *  string s2 = "";
		 */
	
		//문자열 
		// 문자열은 연산중 다른 타입의 변수를 만나면 문자열로 바꾸어 연산을 수행한다.
		// 문자열 + anytype -> 문자열 + 문자열 -> 문자열 (""+7 -> "" + "7" -> "7", ""+7+7 -> ""+"7"+7 -> "7"+7->"7"+"7"->"77"
		// anytype + 문자열 -> 문자열 + 문자열 -> 문자열 (7+7+"" -> 14+""-> "14"+""-> "14")
		
		// 오버플로우 변수에 담길수 있는 범위를 넘어선 값이 주어지면 발생하는 것.
		//byte bb = 127;
		//bb ++;
		//System.out.println(bb); -> -128 계기판의 눈금처럼 돌고돈다. 위의 경우는 가장 작은값으로 넘어가게된다

		// 형변환-> 값의 타입을 다른 타입으로 변환하는 것으로 boolean을 제외한 7개의 기본형은 서로 형변환이 가능하다.
		
		/*
		 * 형식화된 출력 printf() 출력형식을 직접 지정해 줄 수 있다.
		 * %b : 불린 형식으로 출력 
		 * %d : 10진법으로 정수를 출력
		 * %o : 8진법으로 정수를 출력
		 * %x, %X : 16진법으로 정수를 출력
		 * %f : 부동 소수점의 형식으로 출력
		 * %e, %E : 지수 표현식의 형식으로 출력 
		 * %c : 문자로 출력
		 * %s : 문자열로 출력
		 * %g : 실수 출력을 위한 간략한 형식
		 */
		System.out.printf("age : %d year : %d" , 14, 2017);
		/*
		 * 화면에서 입력받기 
		 * Scanner란 화면으로 부터 데이터를 입력받는 기능을 제공하는 클래스
		 * import java.util.Scanner // import문 추가
		 * Scanner sc = new Scanner(System.in); 
		 * Scanner 객체의 사용 
		 * int num = sc.nextInt();  화면에서 입력받은 정수를 num에 저장
		 * String input = sc.nextLine(); 화면에서 입력받은 내용을 input에 저장
		 * int num = integer.parseInt(input) 문자열(input)을 숫자(num)으로 변환 
		 */	
	}
}
