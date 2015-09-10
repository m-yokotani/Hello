<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html:html>
<head>
<title>Hello</title>
</head>
<html:form action="/hello">
	<table>
		<tr>
			<td>
				計算方法 = <bean:write name="HelloForm" property="calculateMethod" scope="request" />
			</td>
		</tr>
		<tr>
			<td>
				値1 = <bean:write name="HelloForm" property="num1" scope="request" />
				, 値2 = <bean:write name="HelloForm" property="num2" scope="request" />
			</td>
		</tr>
	</table>
	<a href="./pages/Who.jsp">Back</a>
</html:form>
</html:html>