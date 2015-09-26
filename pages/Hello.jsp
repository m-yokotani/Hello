<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html:html>
<head>
<title>Result</title>
</head>
<body>

<logic:messagesPresent>
	<logic:redirect forward="fail" />
</logic:messagesPresent>


<html:form action="/hello">
	<table>
		<tr>
			<td>
				���v�Z���@ : <bean:write name="HelloForm" property="calculateMethod" scope="request" />
			</td>
		</tr>
		<tr>
			<td>
				�l1 = <bean:write name="HelloForm" property="strNum1" scope="request" />
				, �l2 = <bean:write name="HelloForm" property="strNum2" scope="request" />
			</td>
		</tr>
		<tr>
			<td>
				������ : <br>
				<bean:write name="HelloForm" property="result" scope="request" /><br>

				<logic:present name="HelloForm" property="judge" scope="request">
					<bean:write name="HelloForm" property="judge" scope="request" />
				</logic:present>
			</td>
		</tr>
	</table>
	<a href="./pages/Who.jsp">Back</a>
</html:form>
</body>
</html:html>
