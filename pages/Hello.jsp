<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html:html>
<head>
<title>Result</title>
</head>
<body>
<html:form action="/hello">
	<table>
		<tr>
			<td>
				�v�Z���@ = <bean:write name="HelloForm" property="calculateMethod" scope="request" />
			</td>
		</tr>
		<tr>
			<td>
				�l1 = <bean:write name="HelloForm" property="num1" scope="request" />
				, �l2 = <bean:write name="HelloForm" property="num2" scope="request" />
			</td>
		</tr>
	</table>
	<a href="./pages/Who.jsp">Back</a>
</html:form>
</body>
</html:html>