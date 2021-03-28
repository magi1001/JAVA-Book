package 자바의_정석;

import java.util.Scanner;

public class Ex4_20 {
	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner sc = new Scanner(System.in);

		outer: while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택해주세요(종료:0)");

			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) { // 메뉴를 무한 반복할 수 있게해줌
				System.out.println("메뉴를 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못선택하셨습니다(종료:0)");
				continue;
			}
			for (;;) { // 계산을 무한반복할 수 있게 해줌
				System.out.println("계산할 값을 입력하세요(계산 종료 : 0, 전체 종료 : 99 )>");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);

				if (num == 0) {
					System.out.println("계산을 종료합니다.");
					break;
				} else if (num == 99) {
					System.out.println("전체 종료를 실행합니다");
					break outer;
				}
				switch (menu) {
				case 1:
					System.out.println("result=" + num * num);
					break;
				case 2:
					System.out.println("result=" + Math.sqrt(num));
				case 3:
					System.out.println("result=" + Math.log(num));
					break;
				}
			}
		}
	}
}
