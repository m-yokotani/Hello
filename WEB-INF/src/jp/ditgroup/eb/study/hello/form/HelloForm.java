/**
 *
 *
 *
 *@author  ���� ��K
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
	private String strNum1;
	private String strNum2;

	// getter���\�b�h
	public String getCalculateMethod() {
		return this.calculateMethod;
	}
	public String getStrNum1() {
		return this.strNum1;
	}
	public String getStrNum2() {
		return this.strNum2;
	}

	// setter���\�b�h
	public void setCalculateMethod(String calculateMethod) {
		this.calculateMethod = calculateMethod;
	}
	public void setStrNum1(String strNum1) {
		this.strNum1 = strNum1;
	}
	public void setStrNum2(String strNum2) {
		this.strNum2 = strNum2;
	}
}