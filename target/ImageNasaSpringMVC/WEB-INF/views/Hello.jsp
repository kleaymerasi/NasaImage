<html>
<head>
    <title>Nasa Image Of The Day</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body style="background:#FAFAFA ;">
<h2>
    <br>
    NASA IMAGE OF THE DAY
</h2>
<div class="media">
    <img src="${nasaImage.url}" width="600" height="500" alt="Responsive image" class="mr-3"><br>
    <div class="media-body">
        <h5 class="mt-0">"${nasaImage.title}"</h5>
        <b>Explanation:</b> "${nasaImage.explanation}" <b>Date:</b> "${nasaImage.date}"
    </div>
</div>
</body>
</html>
