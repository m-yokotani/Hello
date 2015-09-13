package jp.ditgroup.eb.study.hello.calculator;

import jp.ditgroup.eb.study.hello.common.ChangeNumUtil;
import jp.ditgroup.eb.study.hello.common.MathUtil;

public class Rohrer {

	private double weight;
	private double height;

	public Rohrer(String strWeight, String strHeight) {

		ChangeNumUtil changeNum = new ChangeNumUtil();

		weight = changeNum.changeStringToDouble(strWeight);
		height = changeNum.changeStringToDouble(strHeight);
	}

	/**
	 * ���[�����w�����v�Z���܂�
	 * @param weight ����1
	 * @param height ����2
	 * @return ����1�ƈ���2���g�p���ă��[�����w�����v�Z��������
	 */
	private double calculate() {

		MathUtil math = new MathUtil();

		// �ׂ���̌v�Z
		double pow01 = math.calculatePow(height, 3);
		double pow02 = math.calculatePow(10.0d, 7);

		// ���[�����w�� = �̏d�~10^7/�g��^3
		double rohrer = (weight * pow02) / pow01;

		// �v�Z���ʂ�Ԃ�
		return rohrer;
	}

	public double result() {

		return calculate();
	}

	/**
	 * ���[�����w�����瑾���̔�������܂�
	 * @param Rohrer ����1
	 * @return ����1���瑾���𔻒肵������
	 */
	public String judge() {

		// ���ʊi�[�ϐ��̐錾
		String resultJudge = "";

		StringBuffer buf = new StringBuffer();

		// ���[�����w����100�����������ꍇ
		if (calculate() < 100.0d) {

			// ���茋�ʁu���������v���i�[
			resultJudge = "��������";

		// ���[�����w����100�ȏ�115�����������ꍇ
		} else if (calculate() >= 100.0d && calculate() < 115.0d) {

			// ���茋�ʁu��⑉�������v���i�[
			resultJudge = "��⑉������";

		// ���[�����w����115�ȏ�150�����������ꍇ
		} else if (calculate() >= 115.0d && calculate() < 150.0d) {

			// ���茋�ʁu���ρv���i�[
			resultJudge = "����";

		// ���[�����w����150�ȏ�160�����������ꍇ
		}else if (calculate() >= 150.0d && calculate() < 160.0d) {

			// ���茋�ʁu��⑾�肬�݁v���i�[
			resultJudge = "��⑾�肬��";

		// ���[�����w����160�ȏゾ�����ꍇ
		}else if (calculate() >= 160.0d) {

			// ���茋�ʁu����߂��v���i�[
			resultJudge = "����߂�";
		}

		buf.append("*Rohrer�F���茋�� = ");
		buf.append(resultJudge);

		// ���ʂ�ϐ��Ɋi�[
		String result = buf.toString();

		// ���茋�ʂ�Ԃ�
		return result;
	}
}