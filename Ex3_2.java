package 자바의_정석;

public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; 실행 후 i = " + i + ", j=" + j);
		
		j = 0;
		i = 5;
		
		j = ++i;
		System.out.println("i값 = " + i + " j값 " + j);
	}

}
