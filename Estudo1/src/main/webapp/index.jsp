<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Login</title>
  </head>
  <body>
    <form action="FrontControllerServlet">
      Login: <input type="text" name="login"> <br>
      Senha: <input type="password" name="password"> <br>
      <input hidden="true" name="comando" value="Logar">
      <input type="submit" value="Logar">
    </form>
  </body>
</html>
