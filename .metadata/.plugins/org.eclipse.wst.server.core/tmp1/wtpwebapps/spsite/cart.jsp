<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="keyword" content="">
<title>ItemList画面</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

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

#top {
	width: 800px;
	margin: 30px auto;
	padding: 20px 0 20px 0;
	border: 1px solid #333;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#main {
	width: 800px;
	text-align: center;
	margin: 0 auto;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}

#image {
	padding: 100px 100px;
	color: #fff;
	background-color: #000;
	float: left;
}

#right {
	float: right;
}

table {
	width:800px;
	border: 2px solid #000;
	border-collapse: collapse;
}

table td {
	padding: 3px 80px;
	border: 1px solid #000;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">

		<div id="top">
			<p>Cart</p>
			<s:property value = "#session.userName"/>様のカート
		</div>
	<h3>ご購入は以下になります。</h3>
	<s:form action="BuyItemAddressAction">
			<table border="1">
			<tr>
				<th>商品名</th>
				<th>購入個数</th>
				<th>金額</th>

			</tr>
			<s:iterator value ="cartList">
			<tr>
				<td><s:property value = "itemName"/></td>
				<td><s:property value = "itemCount"/><span>個</span></td>
				<td><s:property value = "itemPrice"/><span>円</span></td>
			</tr>
			</s:iterator>
			</table>
			合計<s:property value="session.sum"/>円

			<a href='<s:url action="BuyItemListAction"/>'>買い物を続ける</a>


			<s:hidden name="loginId" value="%{#session.loginId}"/>
			<s:hidden name="cartList" value="%{#session.cartList}"/>
			<s:hidden name="itemCount" value="%{#session.itemCount}"/>
			<s:hidden name="itemPrice" value="%{#session.totalPrice}"/>
			<s:hidden name="sum" value="%{#session.sum}"/>
			<s:submit value="購入する"/>
</s:form>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>




</body>
</html>