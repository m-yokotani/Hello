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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import jp.ditgroup.eb.study.hello.form.HelloForm;

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
		request.setCharacterEncoding("Windows-31J");
		HelloForm helloForm = (HelloForm) form;
		
		// �R���\�[����Ƀ��O��\������
		log.info(" name = "+ helloForm.getName());
		
		return mapping.findForward("success");
	}
}