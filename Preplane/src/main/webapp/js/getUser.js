  var name = sessionStorage.myName;
  $.ajax({
    url: "http://localhost:9090/ws/preplane/user_n/dupont/",
    dataType: "json",
    Type : "GET"
  })
  .done(function( data ) {
    console.log( "Got data", data );
    $("#user").append('<tr class="success"><td>'+'First name: '+data.name+'<br>'+'Last name: '+data.firstName+'<br>'+'Status: '+data.crewStatus+' Member');
  });
