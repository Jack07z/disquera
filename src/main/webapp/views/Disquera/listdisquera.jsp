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
        <a href="disquera?accion=Ingresar">Ingresar</a>
        <a href="disquera?accion=Listar">Listado</a>
      </nav>
    </header>
<body class="bodylist">
  <div class="controllista">
    <div class="container">
      <b><h1>Disqueras</h1></b>
      <p>En esta tabla puedes visualizar los elementos de Disqueras</p>            
      <table class="table table-hover">
          <thead>
          <tr><b>
            <th>IdDisquera</th>
            <th>Nit Disquera</th>
            <th>Nombre Disquera</th>
            <th>Telefono Disquera</th>
            <th>Direccion Disquera</th>
            <th>Estado Disquera</th>
          </tr></b>
          </thead>
        <tbody>
          <c:forEach var="disqueraL" items="${DisqueraList}"> 
            <tr>
              <td>${disqueraL.getIdDisquera()}</td>
              <td>${disqueraL.getNitDisquera()}</td>
              <td>${disqueraL.getNombreDisquera()}</td>
              <td>${disqueraL.getTelefonoDisquera()}</td>
              <td>${disqueraL.getDireccionDisquera()}</td>
                <c:if test="${disqueraL.getEstadoDisquera()  == true}">
              <td><span>Disquera Activo</span></td> 
                </c:if>
                <c:if test="${disqueraL.getEstadoDisquera()  == false}">
              <td><span>Disquera Inactivo</span></td> 
                </c:if>
              <td>
                <c:if test="${disqueraL.getEstadoDisquera() == true}">
              <a href="disquera?accion=estado&idDisquera=${disqueraL.getIdDisquera()}&estado=false"><button type="button">Inactivar</button> </a> 
                </c:if>
                <c:if test="${disqueraL.getEstadoDisquera() == false}">
              <a href="disquera?accion=estado&idDisquera=${disqueraL.getIdDisquera()}&estado=true"><button type="button">Activar</button> </a>
                </c:if>
              </td>
            <td>
              <a href="disquera?accion=editar&idDisquera=${disqueraL.getIdDisquera()}">
              <button type="button">
              Editar
              </button></a>
              <a href="disquera?accion=eliminar&idDisquera=${disqueraL.getIdDisquera()}">
              <button type="button">Eliminar</button> </a>
            </td>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</body>
</html>