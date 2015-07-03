package lotto;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Lotto {
	int[] lotto = new int[6]; //로또는 6개의 숫자로 출력됨

	// 로또가 완성되면 값을 출력
	public int[] getLotto() {
		return lotto;
	}
     //로또 추첨기
	public void setLotto( ) { // 파라미터 를 지운 이유는 랜덤 숫자 발생
	   //배열 요소 의 초기화 방법
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		} 
		int randomNum =0;
		for (int i = 0; i < lotto.length; i++) {
			boolean exist = false; //  밑에 for문을 제어하기 때문에 outer for 문 밖에 초기화 하면 안된다.
	
			randomNum = (int) ((Math.random()*45)+1);
		
			for (int j = 0; j < lotto.length; j++) {
			if (randomNum ==  lotto[j]) { // 중복회피
				exist = true;
				break;
			}
		}
		if (exist) {
			i--; //회전수를 줄여라 6회 ->5회로 
			continue;//회전수를 줄인후 다시 for loop 을 돌아라
		} else {
			lotto[i] = randomNum;

		}
	
		}
		// 이구역을 나왔다는 것은 6개의 숫자가 다 중복없이 추출되었다는 의미
		// 오름차순으로 숫자값들을 정렬하라
		Arrays.sort(lotto);
 	}   
	
}
