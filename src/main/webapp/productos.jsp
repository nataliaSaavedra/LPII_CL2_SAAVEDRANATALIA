<%@page import="model.Producto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body class="bg-success-subtle p-5">
    <%
        List<Producto> productos = (List<Producto>) request.getAttribute("productos");
    %>
    <div class="bg-white p-5 container col-lg-8">
        <h1 class="text-center">Registrar Producto</h1>
        <hr>
        <form action="ProductoController" method="post" class="container col-lg-4">
            <div class="mb-3">
                <label class="form-label" for="txtNombre">Nombre</label>
                <input class="form-control" type="text" id="txtNombre" name="txtNombre" autocomplete="off" required>
            </div>
            <div class="mb-3">
                <label class="form-label" for="txtPrecio">Precio</label>
                <input class="form-control" type="number" id="txtPrecio" name="txtPrecio" autocomplete="off" step="0.1" required min="0.1">
            </div>
            <div class="mb-3">
                <label class="form-label" for="txtPrecioVen">PrecioVen</label>
                <input class="form-control" type="number" id="txtPrecioVen" name="txtPrecioVen" autocomplete="off" step="0.1" required min="0.1">
            </div>
            <div class="mb-3">
                <label class="form-label" for="cboEstado">Estado</label>
                <select class="form-select" id="cboEstado" name="cboEstado">
                    <option value="Vigente">Vigente</option>
                    <option value="No Vigente">No Vigente</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label" for="txtDescripcion">Descripción</label>
                <textarea class="form-control" id="txtDescripcion" name="txtDescripcion" style="height: 150px" required></textarea>
            </div>
            <div class="text-center mb-3">
                <button type="submit" class="btn btn-success">Registrar</button>
            </div>
        </form>
        <hr>
        <h3 class="text-center text-primary mb-1">Datos Registrados en la BD</h3>
        <h5 class="text-center mb-3">Listado de Productos</h5>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <td>Código</td>
                    <td>Producto</td>
                    <td>Precio Venta</td>
                    <td>Precio Compra</td>
                    <td>Estado</td>
                    <td>Descripción</td>
                </tr>
            </thead>
            <tbody>
                <%
                    for(Producto p: productos) {
                %>
                <tr>
                    <td><%=p.getIdproductocl2() %></td>
                    <td><%=p.getNombrecl2() %></td>
                    <td><%=p.getPrecioventacl2() %></td>
                    <td><%=p.getPreciocompcl2() %></td>
                    <td><%=p.getEstadocl2() %></td>
                    <td><%=p.getDescripcl2() %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>