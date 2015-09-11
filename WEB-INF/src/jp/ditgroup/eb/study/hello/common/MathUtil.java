package jp.ditgroup.eb.study.hello.common;

public class MathUtil {

	/**
	 * ‚×‚«æ‚ÌŒvZ
	 * @param num ˆø”1
	 * @param beki ˆø”2
	 * @return ˆø”1‚ğˆø”2‰ñŠ|‚¯‚½Œ‹‰Ê
	 */

	public double calculatePow (double num, int beki) {

		// •Ô‚è’l‚ğŠi”[‚·‚é•Ï”‚ğéŒ¾
		double bekijo = 1.0d;

		// ˆø”‚ğw’è‰ñ”‚¾‚¯Š|‚¯‚éˆ—
		for (int i = 0; i < beki; i++) {

			bekijo *= num;
		}

		// ‚×‚«æŒ‹‰Ê‚Ì’l‚ğ•Ô‚·
		return bekijo;
	}

}