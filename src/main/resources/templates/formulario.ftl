<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="/webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <script src="/webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
    <title>Formulario</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <form action="/submit" method="get">
            <div class="form-group">
                <label for="expetativa1">¿ Las charlas donde usted participó cumplieron con sus expectativas?</label>
                <select class="form-control" id="resultado1" name="resultado1">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="expetativa2">¿Los expositores mostraron tener dominio del tema?</label>
                <select class="form-control" id="resultado2" name="resultado2">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="expetativa3">¿Las instalaciones del evento fueron confortables para usted?</label>
                <select class="form-control" id="resultado3" name="resultado3">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="expetativa4">¿Tiene algún comentario para los organizadores?</label>
                <select class="form-control" id="resultado4"  name="resultado4">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary my-1">Submit</button>
        </form>
    </div>
</div>
</body>
</html>