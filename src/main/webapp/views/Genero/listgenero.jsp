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
    <title>listgenero</title>
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
            <a href="genero?action=Ingresar">Ingresar</a>
            <a href="genero?action=Listar">Listado</a>
          </nav>
    </header>
<body class="bodylist">
  <div class="controllista">
    <div class="container">
      <b><h1>Generos</h1></b>
      <p>En esta tabla puedes visualizar los elementos de Genero</p>            
      <table class="table table-hover">
          <thead>
          <tr><b>
            <th>Id Genero</th>
            <th>Nombre Genero</th>
            <th>Estado Genero</th>
          </tr></b>
          </thead>
        <tbody>

          <c:forEach var="generoL" items="${GeneroList}"> 
            <tr>
              <td>${generoL.getIdGenero()}</td>
              <td>${generoL.getNombreGenero()}</td>
                <c:if test="${generoL.getEstadoGenero()  == true}">
              <td><span>Genero Activo</span></td> 
                </c:if>
                <c:if test="${generoL.getEstadoGenero()  == false}">
              <td><span>Genero Inactivo</span></td> 
                </c:if>
              <td>
                <c:if test="${generoL.getEstadoGenero() == true}">
              <a href="genero?accion=estado&idGenero=${generoL.getIdGenero()}&estado=false"><button type="button">Inactivar</button> </a> 
                </c:if>
                <c:if test="${generoL.getEstadoGenero() == false}">
              <a href="genero?accion=estado&idGenero=${generoL.getIdGenero()}&estado=true"><button type="button">Activar</button> </a>
                </c:if>
              </td>
            <td>
              <a href="genero?accion=editar&idGenero=${generoL.getIdGenero()}">
              <button type="button">
              Editar
              </button></a>
              <a href="genero?accion=eliminar&idGenero=${generoL.getIdGenero()}">
              <button type="button">Eliminar</button> </a>
            </td>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</body>
</html>