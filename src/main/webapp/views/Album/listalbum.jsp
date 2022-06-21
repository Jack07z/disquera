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
        <a href="album?accion=Ingresar">Ingresar</a>
        <a href="album?accion=Listar">Listado</a>
      </nav>
    </header>
<body class="bodylist">
<div class="controllista">
  <div class="container">
    <b><h1>Albums</h1></b>
    <p>En esta tabla puedes visualizar los elementos de Album</p>            
    <table class="table table-hover">
        <thead>
        <tr><b>
          <th>IdAlbum</th>
          <th>Nombre</th>
          <th>Año de Publicacion</th>
          <th>Estado Album</th>
        </tr></b>
        </thead>
        <tbody>

          <c:forEach var="albumL" items="${AlbumList}"> 
            <tr>
              <td>${albumL.getIdAlbum()}</td>
              <td>${albumL.getNombreAlbum()}</td>
              <td>${albumL.getPublicacionAlbum()}</td>
                <c:if test="${albumL.getEstadoAlbum()  == true}">
              <td><span>Album Activo</span></td> 
                </c:if>
                <c:if test="${albumL.getEstadoAlbum()  == false}">
              <td><span>Album Inactivo</span></td> 
                </c:if>
              <td>
                <c:if test="${albumL.getEstadoAlbum() == true}">
              <a href="album?accion=estado&idAlbum=${albumL.getIdAlbum()}&estado=false"><button type="button">Inactivar</button> </a> 
                </c:if>
                <c:if test="${albumL.getEstadoAlbum() == false}">
              <a href="album?accion=estado&idAlbum=${albumL.getIdAlbum()}&estado=true"><button type="button">Activar</button> </a>
                </c:if>
              </td>
            <td>
              <a href="album?accion=editar&idAlbum=${albumL.getIdAlbum()}">
              <button type="button">
              Editar
              </button></a>
              <a href="album?accion=eliminar&idAlbum=${albumL.getIdAlbum()}">
              <button type="button">Eliminar</button> </a>
            </td>
          </c:forEach>
        </tbody>
    </table>
  </div>
</div>
</body>
</html>