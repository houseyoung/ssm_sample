<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Score_Add</title>
</head>
<body>
<form action="${website}score/score_add" method="post">
  学号: <input type="text" name="studentId" /> <br />
  课程: <input type="text" name="courseName" /> <br />
  成绩: <input type="text" name="score" /> <br />
  <input type="submit" value="增加" />
  <input type="reset" value="重置" />
</form>
</body>
</html>