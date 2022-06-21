<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Assets/Css/list.css">
    <link rel="stylesheet" href="Assets/Css/menu.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <title>listartista</title>
</head>
    <header>
      <nav>
        <a href="../../index.jsp">Inicio</a>
        <a href="../Disquera/listdisquera.jsp">Disquera</a>
        <a href="../Album/listalbum.jsp">Album</a>
        <a href="../Genero/listgenero.jsp">Genero</a>
        <a href="../Cancion/listcancion.jsp">Cancion</a>
        <a href="../Artistas/addartista.jsp">Artista</a>
      </nav>
      <nav class="nav-2">
        <a href="addartista.jsp">Ingresar</a>
        <a href="editartista.jsp">Editar</a>
        <a href="listartista.jsp">Listado</a>
      </nav>
    </header>
<body class="bodylist">
  <div class="controllista">
    <div class="container">
      <b><h1>Artista</h1></b>
      <p>En esta tabla puedes visualizar los elementos de Artista</p>            
      <table class="table table-hover">
          <thead>
          <tr><b>
            <th>NoDocumento</th>
            <th>Tipo Documento</th>
            <th>Nombre Artista</th>
            <th>Apellido Artista</th>
            <th>Nacimiento Artista</th>
            <th>Email Artista</th>
            <th>Estado Artista</th>
          </tr></b>
          </thead>
        <tbody>
          <tr>
            <td>1212324234</td>
            <td>Snoop</td>
            <td>Doogg</td>
            <td>1993</td>
            <td>1993</td>
            <td>Snoop@gmail.com</td>
            <td>Activo</td>
          </tr>
          <tr>
            <td>121234324234</td>
            <td>Mozart</td>
            <td>Eeeee</td>
            <td>2004</td>
            <td>1993</td>
            <td>Mozart@gmail.com</td>
            <td>Activo</td>
          </tr>
          <tr>
            <td>122343234234</td>
            <td>wutang</td>
            <td>Clan</td>
            <td>2003</td>
            <td>1993</td>
            <td>Wutang.clan@gmail.com</td>
            <td>Inactivo</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</body>
</html>