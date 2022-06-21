<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Assets/Css/list.css">
    <link rel="stylesheet" href="Assets/Css/menu.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <title>editdisquera</title>
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
<body class="bodydisquera">
<div class="control">
<div class="container">
    <c:forEach var="disqueraEdit" items="${disqueraList}">
    <h1>Editar Disquera "${disqueraEdit.getNombreDisquera()}"</h1>
    <div>
        <form action="disquera" method="post">
        <label for="NitDisquera">Nit Disquera</label>
        <input type="number" class="form-control" placeholder="NitDisquera" name="nitDisquera">
    </div>
    <div class="form-group">
        <label for="Nombredisquera">Nombre de la Disquera</label>
        <input type="text" class="form-control" placeholder="Nombredisquera" name="nombreDisquera">
    </div>
    <div class="form-group">
        <label for="TelDisquera">Telefono Disquera</label>
        <input type="number" class="form-control" placeholder="TelDisquera" name="telefonoDisquera">
    </div>
    <div class="form-group">
        <label for="DireccionDisquera">Direccion de la Disquera</label>
        <input type="text" class="form-control" placeholder="DireccionDisquera" name="direccionDisquera">
    </div>
    <div class="form-group">
        <label for="">Estado Disquera<span class="text-danger">*</span></label>
        <div>
          <input type="checkbox" name="estadoDisquera" id="estadoDisquera" value="${disqueraEdit.getEstadoDisquera()}" checked>
          <label for="chkestado"> Activo</label>
        </div>
        <button type="submit" name="accion" value="Editar">Editar</button>
      </form>
    </c:forEach>
</div>
</div>
</body>
</html>
