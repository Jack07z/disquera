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
    <title>listdisquera</title>
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
        <a href="addcancion.jsp">Ingresar</a>
        <a href="editcancion.jsp">Editar</a>
        <a href="listcancion.jsp">Listado</a>
      </nav>
    </header>
<body class="bodylist">
  <div class="controllista">
    <div class="container">
      <b><h1>Canciones</h1></b>
      <p>En esta tabla puedes visualizar los elementos de Cancion</p>            
      <table class="table table-hover">
          <thead>
          <tr><b>
            <th>Nombre Cancion</th>
            <th>Fecha Grabacion</th>
            <th>Duracion Cancion</th>
            <th>Estado Cancion</th>
          </tr></b>
          </thead>
        <tbody>
          <tr>
            <td>Project Ya neck</td>
            <td>1993</td>
            <td>5:03 minutos</td>
            <td>Activo</td>
          </tr>
          <tr>
            <td>Nuestra Noche</td>
            <td>2015</td>
            <td>5 minutos</td>
            <td>Activo</td>
          </tr>
          <tr>
            <td>Quiereme Asi</td>
            <td>2020</td>
            <td>7 minutos</td>
            <td>Activo</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</body>
</html>