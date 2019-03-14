<%-- 
    Document   : cadastro
    Created on : 07/03/2019, 20:14:29
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastrar</title>
  </head>
  <body>
    <form action="GerenciaUsuario" method="POST">
      Nome:<input type="text" name="nome"><br>
      Senha:<input type="password" name="senha"><br>

      Selecione uma ação:<br>
      <select name="acao" size="3">
        <option value="adicionar">Adicionar</option>
        <option value="remover">Remover</option>
        <option value="atualizarNome">Atualizar</option>
        <option value="atualizarSenha">Atualizar</option>
      </select>
      <input type="submit" value="Executar">	
      <h1>Hello World!</h1>
    </form>
  </body>
</html>
