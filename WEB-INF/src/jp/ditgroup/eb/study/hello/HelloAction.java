/**
 *
 *
 *
 *@author  ���� ��K
 *@since 2015/07/15
 *@version 1.0
 */

package jp.ditgroup.eb.study.hello;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.ditgroup.eb.study.hello.form.HelloForm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * HelloAction.java
 */
public class HelloAction extends Action {

	Log log = LogFactory.getLog(HelloAction.class);

	/**
	 * ���O����ǉ����A����URL�ɑJ�ڂ���
	 * @return ���s���ʂ�ActionForward��Ԃ�
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		HelloForm helloForm = (HelloForm) form;

		// �R���\�[����Ƀ��O��\������
		log.info(" calculateMethod = "+ helloForm.getCalculateMethod());
		log.info(" num1 = " + helloForm.getNum1());
		log.info(" num2 = " + helloForm.getNum2());

		return mapping.findForward("success");
	}
}