<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Student_List</title>
</head>
<body>
<button onclick="location='${website}student/student_add'">增加</button>
<p>
<form method=post action="${website}student/student_list">
  <input type="text" name="keywords"><input type="submit" value="搜索">
</form>
<p>
<table>
  <tr>
    <td>学号</td>
    <td>姓名</td>
    <td>性别</td>
    <td>年龄</td>
  </tr>
  <c:forEach var="student" items="${listStudent}">
    <tr>
      <td>${student.studentId}</td>
      <td>${student.studentName}</td>
      <td>${student.studentSex}</td>
      <td>${student.studentOld}</td>
      <td><button onclick="location='${website}student/student_edit?id=${student.id}'">修改</button></td>
      <td><button onclick="location='${website}student/student_delete?id=${student.id}'">删除</button></td>
      <td><button onclick="location='${website}score/score_list?studentId=${student.studentId}'">查看该生成绩</button></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>