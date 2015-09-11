package jp.ditgroup.eb.study.hello.calculator;

import jp.ditgroup.eb.study.hello.common.ChangeNumUtil;

public class Lcm {

	public int num1;
	public int num2;

	public Lcm(String strNum1, String strNum2){

		ChangeNumUtil changeNum = new ChangeNumUtil();

		num1 = changeNum.changeStringToInt(strNum1);
		num2 = changeNum.changeStringToInt(strNum2);
	}

	/**
	 * �ő���{�������߂܂�
	 * @param num1 ������1
	 * @param num2 ����2
	 * @return ����1�ƈ���2�̍ő���z�������߂�����
	 */
	private int calculate() {

		Dcm dcm = new Dcm(String.valueOf(num1), String.valueOf(num2));

		// 2�̈����̍ő���񐔂�ϐ��ɑ��
		int resultDcm = dcm.calculate();

		// �ő���{�� = (����1�~����2)������1�ƈ���2�̍ő����
		int lcm = (num1 * num2) / resultDcm;

		// �ő���{����Ԃ�
		return lcm;
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