<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Agenda de Contatos</title>
  </head>
  <body>
    <table id="contatos">
      <thead>
        <tr>
          <th>Id</th>
          <th>Nome</th>
          <th>Endereco</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="usuario" items="${lista_usuario}">
            <tr>
              <td>${usuario.id}</td>
              <td>${usuario.nome}</td>
              <td>
                <c:forEach var="filme" items="${usuario.filme}">
                    ${filme.nome}
                </c:forEach>
              </td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
    <form action="FrontControllerServlet">
      Nome:<input type="text" name="nome"> CPF: <input type="text" name="cpf">
      Senha:<input type="password" name="senha"><br>
      Nome rua: <input type="text" name="nmrua"> Número: <input type="text" name="num"><br>
      Complemento: <input type="text" name="comp"><br>
      Cadastrar <input type="radio" name="comando" value="Cadastrar" ><br>
      Recarregar <input type="radio" name="comando" checked="checked" value="ListarContatos">
      <br>
      <input type="submit" value="Atualizar lista">
    </form>
  </body>
</html>