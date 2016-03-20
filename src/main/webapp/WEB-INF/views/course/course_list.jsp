<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Course_List</title>
</head>
<body>
<button onclick="location='${website}course/course_add'">增加</button>
<p>
<form method=post action="${website}course/course_list">
  <input type="text" name="keywords"><input type="submit" value="搜索">
</form>
<p>
<table>
  <tr>
    <td>课程编号</td>
    <td>课程名</td>
    <td>教师</td>
  </tr>
  <c:forEach var="course" items="${listCourse}">
    <tr>
      <td>${course.id}</td>
      <td>${course.courseName}</td>
      <td>${course.courseTeacherName}</td>
      <td><button onclick="location='${website}course/course_edit?id=${course.id}'">修改</button></td>
      <td><button onclick="location='${website}course/course_delete?id=${course.id}'">删除</button></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>