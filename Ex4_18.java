package 자바의_정석;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int num = 0;
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요(종료:0)");
			
			String str = sc.nextLine();
			menu = Integer.parseInt(str);
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못입력하셨습니다.(종료는:0)");
				System.out.println();
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
			System.out.println();
		}

	}

}
