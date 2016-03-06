  $.ajax({
		  url: "http://localhost:8080/ws/preplane/flight",
		})
		  .done(function( data ) {
		      console.log( "Got data", data );
		      data.forEach(function(flight) {
		      $("#listbody").append('<tr class="success"><td>'+flight['commercialNumber']+'</td><td>'+flight['atcNumber']+'</td><td>'+flight['departureAirport']['city']+'</td><td>'+flight['arrivalAirport']['city']+'</td><td>'+flight['flightStatus']+'</td><td>'+flight['crew']+'</td></tr>');
		    });  
		  });
