<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Locadora</title>
  </head>
  <body>
    <table id="usuario">
      <thead>
        <tr>
          <th>Id</th>
          <th>Nome</th>
          <th>CPF</th>
          <th>Endereco</th>
          <th>Filmes</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="usuario" items="${lista_usuario}">
            <tr>
              <td>${usuario.id}</td>
              <td>${usuario.nome}</td>
              <td>${usuario.cpf}</td>
              <td>
                <c:forEach var="endereco" items="${usuario.endereco}">
                    ${endereco.nomeRua}
                    ${endereco.comp}
                    ${endereco.num}
                </c:forEach>
              </td>
              <td>
                <c:forEach var="filme" items="${usuario.filme}">
                    ${filme.nomeFilme}
                    ${filme.ano}
                </c:forEach>
              </td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
    <form action="FrontControllerServlet">
      Nome filme: <input type="text" name="nmfilme"> Ano: <input type="date" name="ano"><br>
      Cadastrar <input type="radio" name="comando" value="Cadastrar" ><br>
      Recarregar <input type="radio" name="comando" checked="checked" value="ListarUsuarios">
      <br>
      <input type="submit" value="Atualizar lista">
    </form>
  </body>
</html>