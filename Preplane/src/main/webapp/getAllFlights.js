$.ajax({
  url: "http://localhost:8080/ws/preplane/flight",
  dataType: "json",
  Type : "GET"
})
.done(function( data ) {
  console.log( "Got data", data );
  data.forEach(function(flight) {
    $("#listbody").append('<tr class="success"><td>'+
    flight['departureDate']+'</td><td>'+
    flight['commercialNumber']+'</td><td>'+
    flight['departureAirport']+
    '</td><td>'+
    flight['arrivalAirport']+
    '</td><td>'+flight['flightStatus']+
    '</td><td>'+flight['crew']+'</td></tr>');
  });
});
