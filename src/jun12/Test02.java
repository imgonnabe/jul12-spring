package jun12;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] a = { 100, 75, 95, 50, 85 };
		int temp;
		while (a[0] > a[1] || a[1] > a[2] || a[2] > a[3] || a[3] > a[4]) {	
			System.out.println("실행합니다.");
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(a));

	}

}
