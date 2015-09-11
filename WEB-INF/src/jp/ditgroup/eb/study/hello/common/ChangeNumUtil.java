package jp.ditgroup.eb.study.hello.common;

public class ChangeNumUtil {

	/**
	 * “ü—Í’l‚ğdoubleŒ^‚É•ÏŠ·‚·‚é
	 * @param args ˆø”1
	 * @return ˆø”1‚ğdoubleŒ^‚É•ÏŠ·‚µ‚½’l
	 */
	public double changeStringToDouble(String args) {

		// “ü—Í’l‚ğdoubleŒ^‚É•ÏŠ·‚µA•Ï”‚É‘ã“ü
		double doubleChange = Double.parseDouble(args);

		// doubleŒ^‚É•ÏŠ·‚µ‚½’l‚ğ•Ô‚·
		return doubleChange;
	}

	/**
	 * “ü—Í’l‚ğintŒ^‚É•ÏŠ·‚·‚é
	 * @param args ˆø”1
	 * @return ˆø”1‚ğintŒ^‚É•ÏŠ·‚µ‚½’l
	 */
	public int changeStringToInt(String args) {

		// “ü—Í’l‚ğintŒ^‚É•ÏŠ·‚µA•Ï”‚É‘ã“ü
		int intChange = (int)Double.parseDouble(args);

		// intŒ^‚É•ÏŠ·‚µ‚½’l‚ğ•Ô‚·
		return intChange;
	}

}