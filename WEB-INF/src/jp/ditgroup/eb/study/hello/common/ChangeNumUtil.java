package jp.ditgroup.eb.study.hello.common;

public class ChangeNumUtil {

	/**
	 * ���͒l��double�^�ɕϊ�����
	 * @param args ����1
	 * @return ����1��double�^�ɕϊ������l
	 */
	public double changeStringToDouble(String args) {

		// ���͒l��double�^�ɕϊ����A�ϐ��ɑ��
		double doubleChange = Double.parseDouble(args);

		// double�^�ɕϊ������l��Ԃ�
		return doubleChange;
	}

	/**
	 * ���͒l��int�^�ɕϊ�����
	 * @param args ����1
	 * @return ����1��int�^�ɕϊ������l
	 */
	public int changeStringToInt(String args) {

		// ���͒l��int�^�ɕϊ����A�ϐ��ɑ��
		int intChange = (int)Double.parseDouble(args);

		// int�^�ɕϊ������l��Ԃ�
		return intChange;
	}

}