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

import jp.ditgroup.eb.study.hello.calculator.Dcm;
import jp.ditgroup.eb.study.hello.calculator.Lcm;
import jp.ditgroup.eb.study.hello.calculator.Rohrer;
import jp.ditgroup.eb.study.hello.calculator.Round;
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

		String error = "";
		double result = 0.0d;

		// �R���\�[����Ƀ��O��\������
		log.info(" calculateMethod = "+ helloForm.getCalculateMethod());
		log.info(" num1 = " + helloForm.getNum1());
		log.info(" num2 = " + helloForm.getNum2());

		if(!"Round".equals(helloForm.getCalculateMethod()) && !"Rohrer".equals(helloForm.getCalculateMethod()) && !"Dcm".equals(helloForm.getCalculateMethod()) && !"Lcm".equals(helloForm.getCalculateMethod())) {

			error = ("*���͒l�G���[�F\"" + helloForm.getCalculateMethod() + "\"�͌v�Z���@�ɂ���܂���B���͂��Ȃ����Ă�������");

			helloForm.setError(error);

			System.exit(1);
		}

		try {

			if("Round".equals(helloForm.getCalculateMethod())) {

				// Round�C���X�^���X�𐶐�
				Round round = new Round(helloForm.getNum1(), helloForm.getNum2());

				result = round.result();
				helloForm.setResult(result);
			}

			if("Rohrer".equals(helloForm.getCalculateMethod())) {

				// Rohrer�C���X�^���X�𐶐�
				Rohrer rohrer = new Rohrer(helloForm.getNum1(), helloForm.getNum2());

				result = rohrer.result();
				helloForm.setResult(result);
			}

			if("Dcm".equals(helloForm.getCalculateMethod())) {

				// Dcm�C���X�^���X�𐶐�
				Dcm dcm = new Dcm(helloForm.getNum1(), helloForm.getNum2());

				result = dcm.result();
				helloForm.setResult(result);
			}

			if("Lcm".equals(helloForm.getCalculateMethod())) {

				// Lcm�C���X�^���X�𐶐�
				Lcm lcm = new Lcm(helloForm.getNum1(), helloForm.getNum2());

				result = lcm.result();
				helloForm.setResult(result);
			}

		} catch (NumberFormatException e){

			error = ("���͒l�ɐ��l�ł͂Ȃ��l���܂܂�Ă��܂��B���l����͂��ĉ������B");
			helloForm.setError(error);
		} catch (ArrayIndexOutOfBoundsException e) {

			error = ("���͒l������܂���B���͒l��2�w�肵�ĉ������B");
			helloForm.setError(error);
		}

		return mapping.findForward("success");
	}
}