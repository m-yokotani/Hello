/**
 *
 *
 *
 *@author  高野 大規
 *@since 2015/07/15
 *@version 1.0
 */

package jp.ditgroup.eb.study.hello.form;

import org.apache.struts.action.ActionForm;
/**
 * HelloForm.java
 */
public class HelloForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String calculateMethod;
	private String num1;
	private String num2;

	// getterメソッド
	public String getCalculateMethod() {
		return this.calculateMethod;
	}
	public String getNum1() {
		return this.num1;
	}
	public String getNum2() {
		return this.num2;
	}

	// setterメソッド
	public void setCalculateMethod(String calculateMethod) {
		this.calculateMethod = calculateMethod;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
}