package 자바의_정석;

class Card {
	String kind;
	int number;

	static int width = 100;
	static int height = 250;
}

public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는(" + c1.width + "," + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는(" + c2.width + "," + c2.height + ")");
		System.out.println("c1은 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80; //클래스 변수(static이 붙은 것)를 변경하였으므로 c2의 값도 바뀌게됨

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는(" + c1.width + "," + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는(" + c2.width + "," + c2.height + ")");
	}
}
