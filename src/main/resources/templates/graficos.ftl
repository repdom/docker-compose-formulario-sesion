<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="/webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <script src="/webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

        // Load the Visualization API and the corechart package.
        google.charts.load('current', {'packages':['corechart']});

        // Set a callback to run when the Google Visualization API is loaded.
        google.charts.setOnLoadCallback(drawChart);

        // Callback that creates and populates a data table,
        // instantiates the pie chart, passes in the data and
        // draws it.
        function drawChart() {

            // Create the data table.
            var data = new google.visualization.DataTable();
            data.addColumn('string', 'Topping');
            data.addColumn('number', 'Slices');
            data.addRows([
                ['¿Las charlas donde usted participó cumplieron con sus expectativas?', ${pregunta1}],
                ['¿Los expositores mostraron tener dominio del tema?', ${pregunta2}],
                ['¿Las instalaciones del evento fueron confortables para usted?', ${pregunta3}],
                ['¿Tiene algún comentario para los organizadores?', ${pregunta4}]
            ]);

            // Set chart options
            var options = {'title':'How Much Pizza I Ate Last Night',
                'width':400,
                'height':300};

            // Instantiate and draw our chart, passing in some options.
            var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
            chart.draw(data, options);
        }
    </script>
</head>
<body>
    <!--Load the AJAX API-->
    <!--Div that will hold the pie chart-->
    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <div id="chart_div"></div>
        </div>
    </div>
</body>
</html>