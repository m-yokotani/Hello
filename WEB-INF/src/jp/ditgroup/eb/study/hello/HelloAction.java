/**
 *
 *
 *
 *@author  高野 大規
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
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 * HelloAction.java
 */
public class HelloAction extends Action {

	Log log = LogFactory.getLog(HelloAction.class);

	/**
	 * ログ情報を追加し、次のURLに遷移する
	 * @return 実行結果のActionForwardを返す
	 */

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		HelloForm helloForm = (HelloForm) form;
		// ActionErrors errors = new ActionErrors();
		ActionMessages errors = new ActionMessages();

		String calculateMethod = helloForm.getCalculateMethod();
		String strNum1 = helloForm.getStrNum1();
		String strNum2 = helloForm.getStrNum2();

		// コンソール上にログを表示する
		log.info(" calculateMethod = "+ calculateMethod);
		log.info(" num1 = " + strNum1);
		log.info(" num2 = " + strNum2);

		if(!"Round".equals(calculateMethod) && !"Rohrer".equals(calculateMethod) && !"Dcm".equals(calculateMethod) && !"Lcm".equals(calculateMethod)) {

			ActionMessage error = new ActionMessage("errors.calculateMethod", calculateMethod);

			errors.add(ActionMessages.GLOBAL_MESSAGE, error);
			saveErrors(request, errors);

			return (mapping.findForward("fail"));
		}

		if("".equals(strNum1) || "".equals(strNum2)) {

			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.arrayIndexOut"));
			saveErrors(request, errors);

			return (mapping.findForward("fail"));
		}

		try {

			if("Round".equals(calculateMethod)) {

				// Roundインスタンスを生成
				Round round = new Round(strNum1, strNum2);

				helloForm.setResult(round.result());
			}

			if("Rohrer".equals(calculateMethod)) {

				// Rohrerインスタンスを生成
				Rohrer rohrer = new Rohrer(strNum1, strNum2);

				helloForm.setResult(rohrer.result());
				helloForm.setJudge(rohrer.judge());
			}

			if("Dcm".equals(calculateMethod)) {

				// Dcmインスタンスを生成
				Dcm dcm = new Dcm(strNum1, strNum2);

				helloForm.setResult(dcm.result());
			}

			if("Lcm".equals(calculateMethod)) {

				// Lcmインスタンスを生成
				Lcm lcm = new Lcm(strNum1, strNum2);

				helloForm.setResult(lcm.result());
			}

		} catch (NumberFormatException e){

			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.numberFormat"));
			saveErrors(request, errors);

			return (mapping.findForward("fail"));

		}

		return mapping.findForward("success");
	}
}