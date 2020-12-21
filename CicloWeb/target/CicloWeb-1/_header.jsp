<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <nav>
        <ul>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="ListaClientes.jsp">Lista de Clientes</a></li>
            <li><a href="AgregarClientes.jsp">Registrar Cliente</a></li>
            <li><a href="AgregarBicicleta.jsp">Registrar Bicicleta</a></li>
            <li><a href="<%session.invalidate();%>">Salir</a></li>
        </ul>
    </nav>
</header>
