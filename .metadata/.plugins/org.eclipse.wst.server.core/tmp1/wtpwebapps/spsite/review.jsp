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

table {
	text-align: center;
	margin: 0 auto;
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
	width: 100%;
	height: 500px;
	text-align: center;
	margin: 0 auto;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}

#text-right {
	display: inline-block;
	text-align: right;
}

#itemList {
	width: 800px;
	margin: 0 auto;
}

ul {
	float: left;
	witdh: 300px;
	border: 1px solid #000;
	margin: 0 25px 25px 0;
}

li {
	list-style: none;
	text-align: center;
	width: 248px;
	background-color: #efefef;
	padding: 2px 0;
}

#image {
	padding: 100px 0;
	color: #fff;
	background-color: #000;
}

#submitbtn {
	display: inline-block;
	padding: 2px 10px;
	margin: 5px;
	text-decoration: none;
	background: #333;
	color: #FFF;
	border-bottom: solid 2px #627295;
	border-radius: 6px;
}

#select-list {
	text-align: left;
}

#select-btn {
	display: inline-block;
	padding: 2px 10px;
	margin: 0 0 5px 10px;
	text-decoration: none;
	background: #FFF;
	color: #000;
	border-bottom: solid 2px #627295;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>

	<div id="main">
		<div id="top">
			<p>Review</p>
		</div>

		<div id="review">
		<s:property value="session.itemName" />
		<s:property value="session.loginId" />
		<table>
			<s:form action="ReviewConfirmAction">
				<tr>
					<td><label>タイトル:</label></td>
					<td><input type="text" name="title" value="" /></td>
				</tr>

				<tr>
					<td><label>評価:</label></td>
					<td><select name="rank">
					<option value="1" selected="selected">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select></td>
				</tr>
				<tr>
					<td><label>コメント:</label></td>
					<td><s:textarea name="comment" /></td>
				</tr>
				<s:hidden name="loginId" value="%{session.loginId}"/>
				<s:hidden name="itemName" value="%{session.itemName}"/>
				<s:hidden name="userName" value="%{session.userName}"/>
				<s:hidden name="itemId" value="%{session.itemId}"/>

				<s:submit value="投稿" />
			</s:form>
		</table>

		</div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>




















</body>
</html>