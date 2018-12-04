<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastrar Itens</title>
  </head>
  <body>
    <form action="CarroServlet" method="POST">
      <h1 style="margin-left: 80px">Cadastro de itens</h1>
      <textarea rows="10" cols="40">
	<%=request.getAttribute("listaCarro") %>
      </textarea><br>
      Cadastrar <input type="radio" name="acao" value="cadastrar" checked="checked" /> |
      Alterar <input type="radio" name="acao" value="alterar" /> |
      Remover <input type="radio" name="acao" value="remover" /> |
      <input type="submit" value="Executar" name="executar" style="margin-left: 30px" /><br><br>
      Nome:<input type="text" name="nome"  />
      Cor:<input type="text" name="cor" /><br><br>
      Modelo:<input type="text" name="modelo" />
      Ano:<input type="text" name="anoFabricacao" />
    </form>
  </body>
</html>
