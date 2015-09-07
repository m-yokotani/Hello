/**
 *
 *
 *
 *@author  çÇñÏ ëÂãK
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
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}