<%@ page language="java" contentType="text/html; charset=Windows-31J" pageEncoding="Windows-31J" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Who</title>
</head>
<body>
<html:form action="/hello">
	<table>
		<html:errors />
		<tr>
			<td>���v�Z���@����͂��ĉ����� <br>
				<html:text property="calculateMethod" size="10" maxlength="30" />
			</td>
		</tr>
		<tr>
			<td>
				���v�Z�Ɏg�p����l��2���͂��ĉ�����<br>
				�l1 <html:text property="num1" size="3" maxlength="10" />
				�l2 <html:text property="num2" size="3" maxlength="10" />
			</td>
		</tr>
		<tr>
			<td><html:submit value="OK" /></td>
		</tr>
	</table>
</html:form>
</body>
</html:html>