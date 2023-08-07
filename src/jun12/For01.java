package jun12;

// 반복문을 제어한다.
public class For01 {
	public static void main(String[] args) {
		// 1~10까지 출력되는 반복문
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			if (i == 5) {
				continue;// 이하 실행문을 무시하고 다시 반복
				// break;// 가장 가까운 반복문을 탈출한다.
				// System.out.println(i);// unreachable code
			}
			System.out.println("continue아래 문장입니다.");
		}
	}

}
