package jp.ditgroup.eb.study.hello.common;

public class MathUtil {

	/**
	 * �ׂ���̌v�Z
	 * @param num ����1
	 * @param beki ����2
	 * @return ����1������2��|��������
	 */

	public double calculatePow (double num, int beki) {

		// �Ԃ�l���i�[����ϐ���錾
		double bekijo = 1.0d;

		// �������w��񐔂����|���鏈��
		for (int i = 0; i < beki; i++) {

			bekijo *= num;
		}

		// �ׂ��挋�ʂ̒l��Ԃ�
		return bekijo;
	}

}