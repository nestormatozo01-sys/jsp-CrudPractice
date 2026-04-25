
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Avianca</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/mainPage.css">
</head>
<body>
<div style="display: flex; align-items: center; justify-content: center;
  background-color: #1593F9">
    <div style="margin: 40px;">
        <h1 STYLE="  color: #FBFBFB">Vuelos Avianca!</h1>
        <h3 STYLE="margin-left:15px; color: #FBFBFB">Informaci&oacute;n de vuelos</h3>
    </div>
</div>

</h1>
<br/>
<form method="post" action="/Vuelos">
    <div class="container"> <h2>Número de vuelo:</h2> <input type="text" name="numeroVuelo" ></div>
    <div class="container"> <h2>Aerolínea:</h2> <input type="text" name="aerol"></div>
    <label for="origen">Seleccione su origen</label>
    <select name="origen" id="origen">
        <option value="Argentina">Argentina</option>
        <option value="Brazil">Brazil</option>
        <option value="Chile">Chile</option>
        <option value="Ecuador">Ecuador</option>
        <option value="El Salvador">El Salvador</option>
    </select>

    <label for="destino">Seleccione su destino</label>
    <select name="destino" id="destino">
        <option value="Argentina">Argentina</option>
        <option value="Brazil">Brazil</option>
        <option value="Chile">Chile</option>
        <option value="Ecuador">Ecuador</option>
        <option value="El Salvador">El Salvador</option>
    </select>
    <h2>Fecha y hora de salida</h2>
    <input type="date" name="fechaS" id="fecha"> <input type="time" name="horaS" id="time">
    <h2>Fecha y hora de llegada</h2>
    <input type="date" name="fechaLL" id="fecha"><input type="time" name="horaLL" id="hora">


    <h2>Duraci&oacute;n de vuelo</h2>
    <input type="text" name="duracion" id="duracion" value="Ingrese la duraci&oacute;n de vuelo ejemplo 3 horas, 1 hora 20 minutos">


    <button type="submit">Enviar</button>
</form>

<table border="1">
    <tr>
        <th>N&uacute;mero de Vuelo</th>
        <th>Oringen</th>
        <th>Destino</th>
        <th>Fecha de salida</th>
        <th>Hora de salida</th>
        <th>Fecha de llegada</th>
        <th>Hora de llegada</th>
        <th>Aerol&iacute;nea</th>
        <th>Duraci&oacute;n de vuelo</th>
        <th>Acciones</th>
    </tr>

   
    <c:forEach var="v" items="${vuelosData}">
        <tr>
            <td>${v.numeroVuelo}</td>
            <td>${v.origen}</td>
            <td>${v.destino}</td>
            <td>${v.fechaSalida}</td>
            <td>${v.horaSalida}</td>
            <td>${v.fechaEntrada}</td>
            <td>${v.horaEntrada}</td>
            <td>${v.aerolinea}</td>
            <td>${v.duracionVuelo}</td>
            <td>
    
    <form method="post" action="${pageContext.request.contextPath}/Vuelos" style="display:inline;">
        <input type="hidden" name="action" value="delete">
        <input type="hidden" name="numeroVuelo" value="${v.numeroVuelo}">
        <button type="submit">Borrar</button>
    </form>

 
    <form method="post" action="${pageContext.request.contextPath}/Vuelos" style="display:inline;">
        <input type="hidden" name="action" value="edit">
        <input type="hidden" name="numeroVuelo" value="${v.numeroVuelo}">
        <button type="submit">Actualizar</button>
    </form>
</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>