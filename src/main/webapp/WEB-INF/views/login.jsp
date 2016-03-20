<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<script type="text/javascript">
    //登录失败提示
    var login_err = '<%=request.getAttribute("login_err") == null ? "" : request.getAttribute("login_err")%>'

    if(login_err != null && login_err != '') {
        alert(login_err);
    }
</script>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Login</title>
</head>
<body>
    <form action="${website}login" method="post">
        用户名: <input type="text" name="userName" /> <br />
        密码： <input type="password" name="password" /> <br />
        <input type="submit" value="登录" />
        <input type="reset" value="重置" />
    </form>
</body>
</html>