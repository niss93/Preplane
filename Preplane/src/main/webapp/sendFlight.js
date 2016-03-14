function sendFlight(){
  var dep = document.getElementById("departure").value
  var arriv = document.getElementById("arrival").value
  var dh =  document.getElementById("dh").value
  var ah =  document.getElementById("ah").value
  var comno = document.getElementById("comno").value
  var atc = document.getElementById("atc").value
  var crew = document.getElementById("crew").value
  var status = document.getElementById("status").value

  $.ajax({
    url: "http://localhost:9090/ws/preplane/flight_a?departure="+dep+
    "&arrival="+arriv+
    "&ddate="+dh+
    "&comno="+comno+
    "&atc="+atc+
    "&status="+status+
    "&crew="+crew+
    "&arrivdate="+ah,
    dataType: "json",
    Type : "GET"
  })
  .done(function( data ) { console.log( "Got data", data );
    alert("Flight added successfully")
    window.location = "http://localhost:9090/occ.html";
  });
}
