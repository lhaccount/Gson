<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 1/2/18
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="result"></div>
<input type="button" value="check" onclick="check()"/>
</body>
<script>
    function check() {
        var xhttp = new XMLHttpRequest();
        xhttp.open("GET", "json", true);
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
                var obj = JSON.parse(xhttp.responseText);
                document.getElementById("result").innerHTML = obj.email + obj.password;
            }
        };
        xhttp.send();
    } </script>
</html>
