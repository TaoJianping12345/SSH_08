<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateEmp">
<table border = "1" width = "500">
<tr>
<td>编号:</td>
<td><input type = "text" readonly="readonly" value = "${emp.id}" name = "id"></td>
</tr>

<tr>
<td>姓名:</td>
<td><input type = "text" value = "${emp.name}" name = "name"></td>
</tr>

<tr>
<td>年纪:</td>
<td><input type = "text" value = "${emp.age}" name = "age"></td>
</tr>
<tr>
<td>QQ:</td>
<td><input type = "text" value = "${emp.qq}" name = "qq"></td>
</tr>
<tr>
<td>时间:</td>
<td><input type = "text" value = "${emp.update_time}" name = "update_time"></td>
</tr>
<tr>
<td>部门:</td>
<td>
<select name = "dept.org_id">
<c:forEach items = "${deptList}" var = "d">
<option value = "${d.org_id}" ${d.org_id==emp.dept.org_id?"selected":""}>${d.org_name}</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td><input type = "submit" value = "修改"></td>
<td><a href = "queryEmp">放弃修改</a></td>
</tr>
</table>
</form>
</body>
</html>