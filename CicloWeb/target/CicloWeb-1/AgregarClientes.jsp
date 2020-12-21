<%--
  Created by IntelliJ IDEA.
  User: ebri_
  Date: 12/20/2020
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true"%>
<%
    int identificacion= 0;
    identificacion =(int) (Math.random()*1000);
%>
<html>
<head>
    <%@include file="_head.jsp"%>
</head>
<body>
<h1>Ciclo Bikers Costa Rica
</h1>

<div class="container">
    <form method="POST">
        <label for="identificacion">Identificacion</label>
        <input class="cliente" id="identificacion" type="text" value="<%=identificacion%>">
        <br><br>

        <label for="nombre">Nombre Completo: </label>
        <input class="cliente" id="nombre" type="text" name="nombre" maxlength="55">
        <br><br>

        <label for="direccion">Direccion: </label>
        <input class="cliente" id="direccion" type="text" name="direccion" maxlength="200">

        <br><br>

        <label for="telefono">Telefono: </label>
        <input class="cliente" id="telefono" type="text" name="telefono" pattern="([0-9]{4}\\-[0-9]{4}">
        <br><br>
        <label for="agregaBici">AgregaBicicleta: </label>
        <input class="cliente" id="agregaBici" type="checkbox" name="agregaBici">

        <fieldset id="datosBici">
            <legend>Ingrese datos de Bici</legend>
            <fieldset>
                <label for="serie">Nombre Completo: </label>
                <input class="cliente" id="serie" type="text" name="serie" maxlength="100">
                <br><br>
                
                <legend>Tipo Bici</legend>
                <select class="cliente" name="bicicleta" id="tipoBici">
                    <optgroup>
                        <option value="Mountain Bike">Mountain Bike</option>
                        <option value="Ruta">Ruta</option>
                    </optgroup>
                </select>
            </fieldset>
            <fieldset>
                <legend>Tipo Mantenimiento</legend>
                <select class="cliente" name="bicicleta" id="tipoMantenimiento">
                    <optgroup>
                        <option value="Basico">Basico</option>
                        <option value="Avanzado">Avanzado</option>
                    </optgroup>
                </select>
            </fieldset>

        </fieldset>

    </form>
</div>
<header>
    <%@include file="_header.jsp"%>
</header>

<footer>
    <%@include file="_footer.jsp"%>
</footer>
</body>
</html>
