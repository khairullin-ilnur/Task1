<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Create Table</title>
    <meta name="author" content="Khairullin Ilnur ">
    <meta charset="UTF-8">
  </head>
  <body>

    <h1>Create Table</h1>
    <p>Enter data</p>

    <%
        if (request.getParameter("error_msg") != null) { %>
    <p><font color="red">${param.error_msg}</font></p>
    <% }  %>

    <form action="/index" method="post">
        <div class="front-sign-in">
            <input type="row" placeholder="Row" name="fieldRow">
            <input type="column" placeholder="Column" name="fieldColumn">
            <input type="submit" value="Create">
        </div>
    </form>

  </body>
</html>