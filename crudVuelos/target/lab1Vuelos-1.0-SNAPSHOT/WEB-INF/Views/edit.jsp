<%-- 
    Document   : edit
    Created on : 24 abr 2026, 9:32:32 p. m.
    Author     : Nesto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar vuelos</title>
    </head>
    <body>
        
<form method="post" action="${pageContext.request.contextPath}/Vuelos">
   
    <input type="hidden" name="action" value="update">
    <!-- Número de vuelo oculto (clave primaria) -->
    <input type="hidden" name="numeroVuelo" value="${vuelo.numeroVuelo}">

    Aerolínea: <input type="text" name="aerol" value="${vuelo.aerolinea}"><br>
    Origen: <input type="text" name="origen" value="${vuelo.origen}"><br>
    Destino: <input type="text" name="destino" value="${vuelo.destino}"><br>
    Fecha salida: <input type="text" name="fechaS" value="${vuelo.fechaSalida}"><br>
    Hora salida: <input type="text" name="horaS" value="${vuelo.horaSalida}"><br>
    Fecha llegada: <input type="text" name="fechaLL" value="${vuelo.fechaEntrada}"><br>
    Hora llegada: <input type="text" name="horaLL" value="${vuelo.horaEntrada}"><br>
    Duración: <input type="text" name="duracion" value="${vuelo.duracionVuelo}"><br>

    <button type="submit">Guardar cambios</button>
</form>


<form method="get" action="${pageContext.request.contextPath}/Vuelos">
    <button type="submit">Cancelar</button>
</form>
    </body>
</html>
