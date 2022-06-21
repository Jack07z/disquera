<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Assets/Css/list.css">
    <link rel="stylesheet" href="Assets/Css/menu.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <title>editalbum</title>
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
        <a href="album?accion=Ingresar">Ingresar</a>
        <a href="album?accion=Listar">Listado</a>
      </nav>
    </header>
<body>
<div class="control">
<div class="container">
  <c:forEach var="AlbumEdit" items="${albumList}">
    <h1>Editar Album"${AlbumEdit.getNombreAlbum()}</h1>
      <div>
        <form action="album" method="post">
        <label for="NombreAlbum">Nombre del Album</label>
        <input type="text" placeholder="NombreAlbum" name="nombreAlbum" value="${AlbumEdit.getNombreAlbum()}">
        <input hidden name="idAlbum" id="idAlbum" type="text" value="${AlbumEdit.getIdAlbum()}" >
      </div>
      <div class=>
        <label for="PublicacionAlbum">Año publicacion Album</label>
        <input type="text" placeholder="PublicacionAlbum" name="publicacionAlbum">
      </div>
        <label for="">Estado Album<span>*</span></label>
      <div>
        <input type="checkbox" name="estadoAlbum" id="estadoAlbum" value="${AlbumEdit.getEstadoAlbum()}" checked>
        <label for="chkestado"> Activo</label>
      </div>
      <button type="submit" name="accion" value="Editar">Editar</button>
    </form>
  </c:forEach>
</div>
</div>
</body>
</html>

