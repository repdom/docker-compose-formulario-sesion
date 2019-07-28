<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="/webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <script src="/webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
    <title>Login</title>
</head>
<body>
    <div style="align-content: center;" class="jumbotron jumbotron-fluid">
        <#if user?? >
            <div>${user.getUsuario()}</div>
        <#else>
            <div class="container">
                <form role="form" action="/entrar" method="get" class="form-group">
                    <div class="form-group">
                        <label for="usuario">Usuario</label>
                        <input type="text" class="form-control" id="usuario" name="usuario">
                    </div>
                    <div class="form-group">
                        <label for="contraisenia">Contraseña</label>
                        <input type="password" class="form-control" id="contraisenia" name="contraisenia">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </#if>
    </div>
</body>
</html>