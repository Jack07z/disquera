<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Assets/Css/Index.css">
    <link rel="stylesheet" href="Assets/Css/menu.css">
    <title>Document</title>
</head>
<body>
    <header>
        <nav>
            <a href="index.jsp">Inicio</a>
            <a href="disquera?accion=Ingresar">Disquera</a>
            <a href="album?accion=Ingresar">Album</a>
            <a href="genero?accion=Ingresar">Genero</a>
            <a href="views/Cancion/listcancion.jsp">Cancion</a>
            <a href="views/Cancion/listcancion.jsp">Artista</a>
          </nav>
        <div class="caja-title">
            <h1 class="title">Encuentra tus mejores artistas</h1>
        </div>
        <img src="Assets/Img/Music_Monochromatic.png" alt="">
        <svg class="wave" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 320">
            <path fill="#f3f4f5" fill-opacity="1" d="M0,64L17.1,85.3C34.3,107,69,149,103,149.3C137.1,149,171,
            107,206,128C240,149,274,235,309,240C342.9,245,377,171,411,144C445.7,117,480,139,514,160C548.6,181
            ,583,203,617,197.3C651.4,192,686,160,720,160C754.3,160,789,192,823,181.3C857.1,171,891,117,926,
            101.3C960,85,994,107,1029,122.7C1062.9,139,1097,149,1131,160C1165.7,171,1200,181,1234,186.7C1268.6,
            192,1303,192,1337,170.7C1371.4,149,1406,107,1423,85.3L1440,64L1440,320L1422.9,320C1405.7,320,1371,
            320,1337,320C1302.9,320,1269,320,1234,320C1200,320,1166,320,1131,320C1097.1,320,1063,320,1029,320C994.3
            ,320,960,320,926,320C891.4,320,857,320,823,320C788.6,320,754,320,720,320C685.7,320,651,320,617,
            320C582.9,320,549,320,514,320C480,320,446,320,411,320C377.1,320,343,320,309,320C274.3,320,240,320,206,
            320C171.4,320,137,320,103,320C68.6,320,34,320,17,320L0,320Z"></path>
        </svg>
    </header>
    <div class="caja-info">
    <h2>Informacion</h2>
        <h3>Misión</h3>
        <br>
        “Brindar a las personas acceso a toda la música que deseen, en cualquier momento - de manera completamente legal y accesible.”
        <h3>vision</h3>
        <br>
        “Tener momentos con música en cualquier lugar.”
    </div>
</body>
</html>
