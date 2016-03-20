<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Course_Edit</title>
</head>
<body>
<form action="${website}course/course_edit?id=${course.id}" method="post">
  课程名: <input type="text" name="courseName" value="${course.courseName}"/> <br />
  教师: <input type="text" name="courseTeacherName" value="${course.courseTeacherName}"/> <br />
  <input type="submit" value="修改" />
  <input type="reset" value="重置" />
</form>
</body>
</html>