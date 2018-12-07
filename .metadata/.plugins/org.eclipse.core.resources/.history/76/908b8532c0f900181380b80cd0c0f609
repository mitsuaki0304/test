<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>HelloStrutsError</title>
</head>
<body>
	<s:property value="name"/>さん、お問い合わせありがとうございました。
	<br>
	お問い合わせの種類:
	<br>
	<s:if test='qtype=="company"'>
	会社について
	</s:if>
	<s:if test='qtype=="product"'>
	製品について
	</s:if>
	<s:if test='qtype=="support"'>
	アフターサポートにについて
	</s:if>
	<br>
	お問い合わせ内容:
	<s:property value="body"/>
</body>
</html>