package jp.ditgroup.eb.study.hello.calculator;

import jp.ditgroup.eb.study.hello.common.ChangeNumUtil;
import jp.ditgroup.eb.study.hello.common.MathUtil;

public class Round {

	private double num;
	private int keta;

	public Round(String strNum, String strKeta) {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		num = changeNum.changeStringToDouble(strNum);
		keta = changeNum.changeStringToInt(strKeta);
	}

	/**
	 * �l�̌ܓ����s���܂��B
	 * @param num ����1
	 * @param keta ����2
	 * @return ����1������2�̌����Ŏl�̌ܓ���������
	 */
	private double calculate() {

		MathUtil math = new MathUtil();

		// �l�̌ܓ��������l����������1���ڂɂ���悤�Ɋ|����l��ϐ��ɑ��
		double pow = math.calculatePow(10.0d, keta - 1);

		// �l�̌ܓ��������s���A�ϐ�round�ɑ��
		double round = (int)(num * pow + 0.5d);

		// �������̌��������l�ɖ߂�
		round /= pow;

		// �l�̌ܓ���̒l��Ԃ�
		return round;

	}

	/**
	 * ���ʂ�String�^�ɕϊ����A�\���܂��B
	 * @return ���ʂ�String�^�ɂ�������
	 */
	public double result() {

		// �v�Z���ʂ�Ԃ�
		return calculate();
	}
}