<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Score_Edit</title>
</head>
<body>
<form action="${website}score/score_edit?id=${scoreDto.id}" method="post">
  学号: ${scoreDto.studentId} <br />
  学生姓名: ${scoreDto.studentName} <br />
  课程: ${scoreDto.courseName} <br />
  成绩: <input type="text" name="score" value="${scoreDto.score}"/> <br />
  <input type="submit" value="修改" />
  <input type="reset" value="重置" />
</form>
</body>
</html>