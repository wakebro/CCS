<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보</title>
</head>
<body>
	<h1>어서오세요, ${userInfo.name }님</h1>
	<table border="1">
		<tr>
			<td><a href="info.jsp"><input type="submit" value="내 정보"></a></td>
			<td><a href="#"><input type="submit" value="출/퇴근"></a></td>
			<td><a href="#"><input type="submit" value="게시판"></a></td>
	</table>
	<br>
	<table border="1">
		<tr>
			<th>이름</th>
			<td>${userInfo.name }</td>
		</tr>
		<tr>
			<th>사번</th>
			<td>${userInfo.no }</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td>${userInfo.pw }</td>
		</tr>
		<tr>
			<th>부서</th>
			<td>${userInfo.dept_no }</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>${userInfo.phone }</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${userInfo.email }</td>
		</tr>
	</table>
</body>
</html>