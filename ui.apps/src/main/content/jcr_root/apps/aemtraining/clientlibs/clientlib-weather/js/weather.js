$( document ).ready(function() {
    console.log( "document loaded" );
    $.ajax({
        type: "GET",
        url: "/content/aemtraining/us/en/tirana/jcr:content/root/container/weather.json",
        dataType: "json",
        success: function (result, status, xhr) {
            // var table = $("<table><tr><th>Weather Description</th></tr>");
            //
            // table.append("<tr><td>City:</td><td>" + result["name"] + "</td></tr>");
            // table.append("<tr><td>Country:</td><td>" + result["sys"]["country"] + "</td></tr>");
            // table.append("<tr><td>Current Temperature:</td><td>" + result["main"]["temp"] + "°C</td></tr>");
            // table.append("<tr><td>Humidity:</td><td>" + result["main"]["humidity"] + "</td></tr>");
            // table.append("<tr><td>Weather:</td><td>" + result["weather"][0]["description"] + "</td></tr>");
            //
            // $("#weather-container").html(table);
            console.log(result);
            var source = $("#weather-template").html();
            var template = Handlebars.compile(source);
            var html = template(result);
            // $("#movies").append(html); elemento con id
            $(".weather-container").append(html); //elemento con class
        },
        error: function (xhr, status, error) {
            alert("Result: " + status + " " + error + " " + xhr.status + " " + xhr.statusText)
        }
    });
});