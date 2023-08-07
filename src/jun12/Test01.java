package jun12;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] a = { 75, 95, 85, 100, 50 };
//		                85  95  50   100
//		                    50  95
//		                50  85
//		            50  75    
		int temp;
		
		for (int i = 0; i < a.length; i++) {
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
