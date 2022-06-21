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
    <title>editcancion</title>
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
<body>
<div class="control">
<div class="container">
    <h1>Editar Cancion</h1>
      <div class="form-group">
        <label for="NombreCancion">Nombre del Cancion</label>
        <input type="text" class="form-control" placeholder="NombreCancion" name="NombreCancion">
      </div>
      <div class="form-group">
        <label for="FechaGrabacion">Fecha Grabacion</label>
        <input type="date" class="form-control" placeholder="FechaGrabacion" name="FechaGrabacion">
      </div>
      <div class="form-group">
        <label for="Duracioncancion">Duracion Cancion</label>
        <input type="number" class="form-control" placeholder="Duracioncancion" name="Duracioncancion">
      </div>
      <div class="form-group">
          <label for="pwd">Estado Cancion</label>
          <select class="form-control" name="EstadoCancion">
              <option value="Activo">Activo</option>
              <option value="Inactivo">Inactivo</option>
          </select>
      </div>
      <button type="submit" class="btn btn-primary">Editar</button>
    </form>
  </div>
</div>
</body>
</html>
