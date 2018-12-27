<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>BuyItem画面</title>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}

#top {
	width: 780px;
	margin: 30px auto;
	border: 1px solid #333;
}


#main {
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}
</style>
</head>
<body>

	<div id="header">
		<jsp:include page="header.jsp" />
	</div>
	<div id="main">
		<div id="top">
			<p>MyPage</p>
		</div>

		<s:form action="BuyItemHistoryAction">
		<s:hidden name="loginId" value="session.loginId" />
			<s:hidden name="itemId" value="session.itemId" />
			<s:submit value="購入履歴" />
		</s:form>

		<s:form action="AddressCreateAction">
			<s:submit value="住所登録" />
			<s:hidden name="loginId" value="session.loginId" />
			<s:hidden name="userName" value="session.userName" />
		</s:form>


		<div></div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>
