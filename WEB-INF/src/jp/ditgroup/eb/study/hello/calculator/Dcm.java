package jp.ditgroup.eb.study.hello.calculator;

import jp.ditgroup.eb.study.hello.common.ChangeNumUtil;

public class Dcm {

	private int num1;
	private int num2;

	public Dcm(String strNum1, String strNum2) {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		num1 = changeNum.changeStringToInt(strNum1);
		num2 = changeNum.changeStringToInt(strNum2);
	}

	/**
	 * �ő���񐔂����߂܂�
	 * @param num1 ����1
	 * @param num2 ����2
	 * @return ����1�ƈ���2�̍ő����
	 */
	public int calculate() {

		int big = 0;
		int small = 0;

		// �����̑傫�����ׁA�ϐ��ɑ��
		if(num1 >= num2) {

			big = num1;
			small = num2;
		} else {

			big = num2;
			small = num1;
		}

		// �����̑傫���������������Ŋ���A���̗]�肪0�ɂȂ�܂ŌJ��Ԃ��������s��
		while(big % small != 0) {

			// �傫���������������Ŋ������]���ϐ��ɑ��
			int remainder = big % small;

			// ���������������鐔�ɁA�]������鐔�ɐݒ�
			big = small;
			small = remainder;
		}

		// �ő���񐔂�Ԃ�
		return small;
	}


	/**
	 * ���ʂ�String�^�ɕϊ����A�\���܂��B
	 * @return ���ʂ�String�^�ɂ�������
	 */
	public double result() {
		// �v�Z���ʂ�Ԃ�
		return (double)calculate();
	}
}