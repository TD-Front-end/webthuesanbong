<%--
  Created by IntelliJ IDEA.
  User: TienDat
  Date: 27/03/2022
  Time: 9:04 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/control/logincontrol" >
        <%--                            message--%>
        <p class="text-danger">${mess}</p>
        <div class="mb-3">
            <label class="mb-2 text-muted" for="email">E-Mail Address</label>
            <input id="email" type="email" class="form-control" name="email" value="" required autofocus>

        </div>

        <div class="mb-3">
            <div class="mb-2 w-100">
                <label class="text-muted" for="password">Password</label>

            </div>
            <input id="password" type="password" class="form-control" name="password" required>
        </div>

        <div class="d-flex align-items-center">
            <button type="submit" class="btn btn-primary ms-auto">
                Login
            </button>
        </div>
    </form>
</body>
</html>
