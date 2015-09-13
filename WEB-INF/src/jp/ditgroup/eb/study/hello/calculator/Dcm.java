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
	 * 最大公約数を求めます
	 * @param num1 引数1
	 * @param num2 引数2
	 * @return 引数1と引数2の最大公約数
	 */
	public int calculate() {

		int big = 0;
		int small = 0;

		// 引数の大きさを比べ、変数に代入
		if(num1 >= num2) {

			big = num1;
			small = num2;
		} else {

			big = num2;
			small = num1;
		}

		// 引数の大きい方を小さい方で割り、その余りが0になるまで繰り返し処理を行う
		while(big % small != 0) {

			// 大きい方を小さい方で割った余りを変数に代入
			int remainder = big % small;

			// 小さい方を割られる数に、余りを割る数に設定
			big = small;
			small = remainder;
		}

		// 最大公約数を返す
		return small;
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