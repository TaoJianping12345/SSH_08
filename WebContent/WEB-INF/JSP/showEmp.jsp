<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="queryEmp">
姓名:<input type = "text" name = "name">
部门: <select name = "org_id">
<option value = "0">请选择</option>
<c:forEach items="${deptList}" var = "d">
<option value = "${d.org_id}">${d.org_name}</option>
</c:forEach>
</select>
<input type = "submit" value = "查询">
</form>
<table border = "1" width = "500">
<tr>
<th>编号</th>
<th>姓名</th>
<th>年纪</th>
<th>QQ</th>
<th>时间</th>
<th>部门</th>
<th>操作</th>
</tr>

<c:forEach items="${empList}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.age}</td>
<td>${e.qq}</td>
<td>${e.update_time}</td>
<td>${e.dept.org_name}</td>
<td>
<a href="getObjectEmp?id=${e.id}">修改</a>
<a href="deleteEmp?id=${e.id}" onclick="return confirm('您确定要删除${e.name}信息吗?')">删除</a></td>
</tr>
</c:forEach>
</table>
</body>

<form action="insertEmp">
姓名:<input type = "text" name = "name">
年龄:<input type = "text" name = "age">
QQ:<input type = "text" name = "qq">
时间:<input type = "text" name = "update_time">
部门 :<select name = "dept.org_id">
<c:forEach items = "${deptList}" var = "d">
<option value = "${d.org_id}">${d.org_name}</option>
</c:forEach>
</select>
<input type = "submit" value = "添加"> 
</form>
</html>