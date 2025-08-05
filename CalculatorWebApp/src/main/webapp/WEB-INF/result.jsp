<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h2>Calculation Result</h2>
    <%
        String message = (String) request.getAttribute("message");
        if (message != null && !message.isEmpty()) {
    %>
        <p style="color:red;"><%= message %></p>
    <%
        } else {
            double result = (Double) request.getAttribute("result");
    %>
        <p>Result: <%= result %></p>
    <%
        }
    %>
    <a href="index.jsp">Back</a>
</body>
</html>
