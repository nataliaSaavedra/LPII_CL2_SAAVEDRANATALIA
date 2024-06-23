<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<body class="p-5 bg-success-subtle">
    <%
        String msjError = (String) request.getAttribute("msjError");
    %>
    <div class="p-5 container col-lg-4 bg-white border border-1 rounded">
        <h1 class="text-center">Iniciar Sesión</h1>
        <hr>
        <form action="UsuarioController" method="post">
            <div class="mb-3">
                <label class="form-label" for="txtUsuario">Usuario:</label>
                <input class="form-control" id="txtUsuario" name="txtUsuario" type="text" placeholder="user" required autocomplete="off">
            </div>
            <div class="mb-3">
                <label class="form-label" for="txtPassword">Contraseña:</label>
                <input class="form-control" id="txtPassword" name="txtPassword" type="password" placeholder="123" required>
            </div>
            <button type="submit" class="btn btn-primary mb-3">Ingresar</button>
            <%
                if(msjError != null) {
            %>
            <div class="alert alert-danger text-center">
                <%=msjError %>
            </div>
            <%
                }
            %>
        </form>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>