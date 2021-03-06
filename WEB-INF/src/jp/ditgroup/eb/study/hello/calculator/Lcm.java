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
	 * 最大公倍数を求めます
	 * @param num1 引き数1
	 * @param num2 引数2
	 * @return 引数1と引数2の最大勾配数を求めた結果
	 */
	private int calculate() {

		Dcm dcm = new Dcm(String.valueOf(num1), String.valueOf(num2));

		// 2つの引数の最大公約数を変数に代入
		int resultDcm = dcm.calculate();

		// 最大公倍数 = (引数1×引数2)÷引数1と引数2の最大公約数
		int lcm = (num1 * num2) / resultDcm;

		// 最大公倍数を返す
		return lcm;
	}

	/**
	 * 結果をString型に変換し、表します。
	 * @return 結果をString型にしたもの
	 */
	public double result() {

		// 計算結果を返す
		return (double)calculate();
	}
}