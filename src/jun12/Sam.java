package jun12;

import java.util.Arrays;

// 3x3배열에 1~9까지 숫자 랜덤하게 입력하기
public class Sam {
	public static void main(String[] args) {
		int[][] sam = new int[3][3];

		for (int i = 0; i < sam.length; i++) {
			for (int j = 0; j < sam[i].length; j++) {
				int temp = (int) (Math.random() * 9) + 1;
				System.out.println("뽑은 숫자: " + temp);
				boolean check = false;
				Check: for (int k = 0; k < 3; k++) {
					for (int k2 = 0; k2 < 3; k2++) {
						if (temp == sam[k][k2]) {
							check = true;
							break Check;
						}
					}
				}
				if (check) {
					j--;
				} else {
					sam[i][j] = temp;
				}
			}
		}

		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}
	}

}
