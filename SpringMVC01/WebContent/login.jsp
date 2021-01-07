<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="handler/welcome">first - springMvc - welcome</a>
	<br/>
	<a href="handler/welcomepost">second - springMvc - welcomePost</a>
	<br/>
	<form action="handler/welcomeparam" method="post">
		<input name="name">
		<input type="submit">
	</form>
	<br/>
	<a href="handler/welcomeparamisheader">third - springMvc - welcomeparamisheader</a>
	<br/>
	<a href="handler/abc/welcomewenhao">ant? - springMvc - welcome</a>
	<br/>
	<a href="handler/aksdlna/welcomex">ant* - springMvc - welcome</a>
	<br/>
	<a href="handler/sjld/sjdal/welcomexx">ant** - springMvc - welcome</a>
	<br/>
	<hr>测试REST风格<hr/>
	<form action="handler/testPost/张三" method="post">
		<input type="submit" value="增">
	</form>
	<br/>
	<form action="handler/testDelete/张三" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="删">
	</form>
	<br/>
	<form action="handler/testPut/张三" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="text" name="username"/>
		<input type="submit" value="改">
	</form>
	<br/>
	<form action="handler/testPost/张三" method="post">
		<input type="submit" value="查">
	</form>
	<br/>
	
	<form action="handler/testObject"  method="post">
		<input name="id" value="1"/>
		<input name="name" value="周禄涵"/>
		<input name="address.homeAddress" value="homeAddress"/>
		<input name="address.schoolAddress" value="schoolAddress"/>
		<input type="submit" value="给对象自动赋值">
	</form>
</body>
</html>