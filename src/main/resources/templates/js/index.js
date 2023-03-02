$(document).ready(function(){

    $( "#updateCharacters" ).click(function() {
        var settings = {
          "url": "/savecharacter",
          "method": "GET",
          "timeout": 0,
        };
        
        $.ajax(settings).done(function (response) {
          console.log(response);
        });
      });
    
});

/*
      var settings = {
            "url": "https://gateway.marvel.com/v1/public/characters?limit=20&ts=1677602287592&apikey=a0a0ee8aa7c82af36d5565f09ac18ac2&hash=c807017d36990364a71dc6035fa9b221",
            "method": "GET",
            "timeout": 0,
          };
          
          $.ajax(settings).done(function (response) {
            var characters=response.data.results;
            characters.forEach(element => {
                console.log(element);
                $("#characters").append($("<li>").text(element.name));
            });
          }).fail( function( ) {
            alert( 'Error!!' );
        });
*/