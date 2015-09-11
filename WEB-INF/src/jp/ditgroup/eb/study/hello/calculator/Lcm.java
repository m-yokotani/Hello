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
	 * Å‘åŒö”{”‚ğ‹‚ß‚Ü‚·
	 * @param num1 ˆø‚«”1
	 * @param num2 ˆø”2
	 * @return ˆø”1‚Æˆø”2‚ÌÅ‘åŒù”z”‚ğ‹‚ß‚½Œ‹‰Ê
	 */
	private int calculate() {

		Dcm dcm = new Dcm(String.valueOf(num1), String.valueOf(num2));

		// 2‚Â‚Ìˆø”‚ÌÅ‘åŒö–ñ”‚ğ•Ï”‚É‘ã“ü
		int resultDcm = dcm.calculate();

		// Å‘åŒö”{” = (ˆø”1~ˆø”2)€ˆø”1‚Æˆø”2‚ÌÅ‘åŒö–ñ”
		int lcm = (num1 * num2) / resultDcm;

		// Å‘åŒö”{”‚ğ•Ô‚·
		return lcm;
	}

	/**
	 * Œ‹‰Ê‚ğStringŒ^‚É•ÏŠ·‚µA•\‚µ‚Ü‚·B
	 * @return Œ‹‰Ê‚ğStringŒ^‚É‚µ‚½‚à‚Ì
	 */
	public double result() {

		// ŒvZŒ‹‰Ê‚ğ•Ô‚·
		return (double)calculate();
	}
}