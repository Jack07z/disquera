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
    <title>addartista</title>
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
<body class="bodyartista">
<div class="control">
<div class="container">
    <h1>Ingresar Artista</h1>
    <div class="form-group">
        <label for="NoDocumento">Numero Documento</label>
        <input type="number" class="form-control" placeholder="NoDocumento" name="NoDocumento">
    </div>
    <div class="form-group">
        <label for="pwd">Tipo de Documento</label>
            <select class="form-control" name="TipoDocumento">
                <option value="Activo">T.I</option>
                <option value="Inactivo">C.C</option>
                <option value="Inactivo">C.E</option>
            </select>
    </div>
    <div class="form-group">
        <label for="NombreArtista">Nombre del Artista</label>
        <input type="text" class="form-control" placeholder="NombreArtista" name="NombreArtista">
    </div>
    <div class="form-group">
        <label for="ApellidoArtista">Apellido del Artista</label>
        <input type="text" class="form-control" placeholder="ApellidoArtista" name="ApellidoArtista">
    </div>
    <div class="form-group">
        <label for="NacimientoArtista">Fecha del Nacimiento del Artista</label>
        <input type="date" class="form-control" placeholder="NacimientoArtista" name="NacimientoArtista">
    </div>
    <div class="form-group">
        <label for="EmailArtista">Email del Artista</label>
        <input type="email" class="form-control" placeholder="EmailArtista" name=EmailArtista">
    </div>
    <div class="form-group">
          <label for="pwd">Estado Artista</label>
            <select class="form-control" name="EstadoArtista" >
                <option value="Activo">Activo</option>
                <option value="Inactivo">Inactivo</option>
            </select>
      </div>
      <button type="submit" class="btn btn-primary">Ingresar</button>
    </form>
  </div>
</div>
</body>
</html>