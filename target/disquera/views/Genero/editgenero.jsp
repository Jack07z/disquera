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
    <title>editgenero</title>
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
<body>
<div class="control">
<div class="container">

  <c:forEach var="generoEdit" items="${generoList}">
    <h1>Editar Genero "${generoEdit.getNombreGenero()}"</h1>
    <div>
        <form action="genero" method="post">
        <label for="">Nombre del Genero</label>
          <input type="text" placeholder="Nombre" name="nombreGenero" value="${generoEdit.getNombreGenero()}" >
          <input hidden name="idGenero" id="idGenero" type="text" value="${generoEdit.getIdGenero()}" >
      </div>
        <label for="">Estado Genero<span>*</span></label>
        <div>
          <input type="checkbox" name="estadoGenero" id="estadoGenero" value="${GeneroEdit.getEstadoGenero()}" checked>
          <label for="chkestado"> Activo</label>
      </div>
      <button type="submit" name="accion" value="Editar">Editar</button>
    </form>
  </c:forEach>

  </div>
</div>
</body>
</html>
                
 

              

      
  