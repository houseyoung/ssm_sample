<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Student_Edit</title>
</head>
<body>
<form action="${website}student/student_edit?id=${student.id}" method="post">
  学号: <input type="text" name="studentId" value="${student.studentId}"/> <br />
  姓名: <input type="text" name="studentName" value="${student.studentName}"/> <br />
  性别: <input type="text" name="studentSex" value="${student.studentSex}"/> <br />
  年龄: <input type="text" name="studentOld" value="${student.studentOld}"/> <br />
  <input type="submit" value="修改" />
  <input type="reset" value="重置" />
</form>
</body>
</html>