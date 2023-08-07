package jun12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 중복없이 로또번호 뽑기
public class Lotto {
	public static void main(String[] args) {
		// 추후에 배울 정말 쉬운 방법1
		// 중복을 저장하지 않는 자료형을 이용하는 방법
		// Set 자료형 생성하기
		Set<Integer> lotto = new HashSet<Integer>();
		
		// lotto의 내부 크기가 6보다 작으면 실행
		while (lotto.size()<6) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(lotto);
		
		//정렬하기
	      ArrayList<Integer> lottoSort 
	               = new ArrayList<Integer>(lotto);
	      Collections.sort(lottoSort);
	      System.out.println(lottoSort);

	}

}
