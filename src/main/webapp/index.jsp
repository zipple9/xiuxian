<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/30
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>xiuxian</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>



hello
<button id="b1">login</button>
</body>


<script>
    $(function () {
        $("#b1").click(function () {
            window.location.href="home?login";
        })
    })
</script>
</html>
