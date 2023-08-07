package jun12;

import java.util.Arrays;
import java.util.Scanner;

public class While04 {
	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			// 0~100
			System.out.print(i + 1 + "번째 인원의 점수를 입력: ");
			int input = sc.nextInt();
			while (input > 100 || input < 0) {
				System.out.println("다시 입력해주세요.");
				input = sc.nextInt();
			}
			score[i] = input;
		}
		System.out.println(Arrays.toString(score));
		sc.close();
	}
}
