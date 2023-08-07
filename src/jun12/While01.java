package jun12;

// 무한반복문
// while, do~while이 있다.
/*
 * while문은 보통 무한반복을 실행하다가 특정 조건이 되면 탈출하도록 한다.
 * 채팅이나 게임 등 무한반복이 필요한 로직에서 활용된다.
 */
public class While01 {
	public static void main(String[] args) {
		// 조건식이 참이라면 무한반복
		int num = 1;
		//boolean b = 1 + 3 == 2; > !b
		while (num < 10) {
			System.out.println("참입니다.");
			num++;
		}
	}

}
