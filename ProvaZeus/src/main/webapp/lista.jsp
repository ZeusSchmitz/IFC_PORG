<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Cadastro</title>
  </head>
  <body>
    <form action="FrontControllerServlet">
      Faça seu cadastro abaixo:<br>
      CPF: <input type="text" name="cpf">
      Nome rua: <input type="text" name="nmrua"> Número: <input type="text" name="num"><br>
      Complemento: <input type="text" name="comp"><br>
      Cadastrar <input type="radio" name="comando" value="Cadastrar" ><br>
      <br>
      <input type="submit" value="Atualizar lista">
    </form>
  </body>
</html>