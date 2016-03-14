$.ajax({
  url: "http://localhost:9090/ws/preplane/flight",
  dataType: "json",
  Type : "GET"
})
.done(function( data ) {
  console.log( "Got data", data );
  data.forEach(function(flight) {
    $("#listbody").append('<tr class="success"><td>'+flight['departureDate']+'</td><td>'+
    flight['atcNumber']+'</td><td>'+
    flight['departureAirport']+
    '</td><td>'+
    flight['arrivalAirport']+
    '</td><td>'+flight['flightStatus']+
    '</td><td>'+flight['crew']+'</td></tr>'+
    flight['commercialNumber']);
  });
});
