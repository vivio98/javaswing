package lotto;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Lotto {
	int[] lotto = new int[6]; //�ζǴ� 6���� ���ڷ� ��µ�

	// �ζǰ� �ϼ��Ǹ� ���� ���
	public int[] getLotto() {
		return lotto;
	}
     //�ζ� ��÷��
	public void setLotto( ) { // �Ķ���� �� ���� ������ ���� ���� �߻�
	   //�迭 ��� �� �ʱ�ȭ ���
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;
		} 
		int randomNum =0;
		for (int i = 0; i < lotto.length; i++) {
			boolean exist = false; //  �ؿ� for���� �����ϱ� ������ outer for �� �ۿ� �ʱ�ȭ �ϸ� �ȵȴ�.
	
			randomNum = (int) ((Math.random()*45)+1);
		
			for (int j = 0; j < lotto.length; j++) {
			if (randomNum ==  lotto[j]) { // �ߺ�ȸ��
				exist = true;
				break;
			}
		}
		if (exist) {
			i--; //ȸ������ �ٿ��� 6ȸ ->5ȸ�� 
			continue;//ȸ������ ������ �ٽ� for loop �� ���ƶ�
		} else {
			lotto[i] = randomNum;

		}
	
		}
		// �̱����� ���Դٴ� ���� 6���� ���ڰ� �� �ߺ����� ����Ǿ��ٴ� �ǹ�
		// ������������ ���ڰ����� �����϶�
		Arrays.sort(lotto);
 	}   
	
}
