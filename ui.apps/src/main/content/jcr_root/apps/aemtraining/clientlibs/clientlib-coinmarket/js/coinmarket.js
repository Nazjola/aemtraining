$( document ).ready(function() {
    console.log( "document loaded" );

    $.ajax({
        type: "GET",
        url: "/content/aemtraining/us/en/coinmarket/jcr:content/root/container/coinmarket.json",
        dataType: "json",
        success: function (result, status, xhr) {
            console.log(result);
            var source = $("#coinmarket-template").html();
            var template = Handlebars.compile(source);
            var html = template(result.coinMarketBean);
            $(".coinmarket-container").append(html);
        },
        error: function (xhr, status, error) {
            alert("Result: " + status + " " + error + " " + xhr.status + " " + xhr.statusText)
        }
    });
});