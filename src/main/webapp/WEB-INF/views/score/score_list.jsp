<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Score_List</title>
</head>
<body>
<button onclick="location='${website}score/score_add'">增加</button>
<p>
<form method=post action="${website}score/score_list">
  <input type="text" name="keywords"><input type="submit" value="搜索">
</form>
<p>
<table>
  <tr>
    <td>学号</td>
    <td>姓名</td>
    <td>课程名</td>
    <td>成绩</td>
  </tr>
  <c:forEach var="score" items="${listScore}">
    <tr>
      <td>${score.studentId}</td>
      <td>${score.studentName}</td>
      <td>${score.courseName}</td>
      <td>${score.score}</td>
      <td><button onclick="location='${website}score/score_edit?id=${score.id}'">修改</button></td>
      <td><button onclick="location='${website}score/score_delete?id=${score.id}'">删除</button></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>