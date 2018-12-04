<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Entrar</title>
  </head>
  <body>
    <form action="UsuarioServlet" method="POST">
      Login: <input type="text" name="login" value="" /><br>
      Senha: <input type="password" name="senha" value="" /><br> 
      Entrar <input type="radio" name="acao" value="entrar" checked="checked" /> |
      Cadastrar <input type="radio" name="acao" value="cadastrar" /> |
      Esqueci a senha <input type="radio" name="acao" value="esqSenha" /> |
      <input type="submit" value="Executar" name="executar" style="margin-left: 10px"/>
    </form>
  </body>
</html>
