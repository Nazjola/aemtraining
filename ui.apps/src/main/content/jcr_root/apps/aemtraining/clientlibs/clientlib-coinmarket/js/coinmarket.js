$( document ).ready(function() {
    console.log( "document loaded" );

    $.ajax({
        type: "GET",
        url: "/content/aemtraining/us/en/coinmarket/jcr:content/root/container/coinmarket.json",
        dataType: "json",
        success: function (result, status, xhr) {
            // var table = $("<table><tr><th>Weather Description</th></tr>");
            // table.append("<tr><td>City:</td><td>" + result["name"] + "</td></tr>");
            // table.append("<tr><td>Country:</td><td>" + result["sys"]["country"] + "</td></tr>");
            // table.append("<tr><td>Current Temperature:</td><td>" + result["main"]["temp"] + "°C</td></tr>");
            // table.append("<tr><td>Humidity:</td><td>" + result["main"]["humidity"] + "</td></tr>");
            // table.append("<tr><td>Weather:</td><td>" + result["weather"][0]["description"] + "</td></tr>");
            //
            // $("#weather-container").html(table);
            console.log(result);
            console.log(url);
            var source = $("#coinmarket-template").html();
            var template = Handlebars.compile(source);
            var html = template(result);
            $(".coinmarket-container").append(html);
        },
        error: function (xhr, status, error) {
            alert("Result: " + status + " " + error + " " + xhr.status + " " + xhr.statusText)
        }
    });
});