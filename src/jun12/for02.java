package jun12;

// 구구단 2단
public class for02 {
	public static void main(String[] args) {
		// 2 * i가 10보다 작을 경우 출력
		for (int i = 1; i < 10; i++) {
			if (2 * i >= 10) {
				break;
//				continue;
			}
			System.out.printf("%d X %d = %d\n", 2, i, 2 * i);
		}
	}

}
