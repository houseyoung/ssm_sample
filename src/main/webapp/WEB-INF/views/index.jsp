<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Index</title>
</head>
<body>
    <button onclick="location='${website}student/student_list'">学生管理</button>
    <button onclick="location='${website}course/course_list'">课程管理</button>
    <button onclick="location='${website}score/score_list'">成绩管理</button>
    　<button onclick="location='${website}logoff'">退出登录</button>
</body>
</html>