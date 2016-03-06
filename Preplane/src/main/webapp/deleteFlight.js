function deleteFlight(){

  var dep = document.getElementById("departure").value
  var dh =  document.getElementById("dh").value
  var comno = document.getElementById("comno").value
  $.ajax({
    url: "http://localhost:8080/ws/preplane/flight/+"+dh+"/"+dep+"/"+comno,
    Type : "GET"
  })
  .done(function( data ) {
    console.log( "Got data", data );
    alert("Flight deleted successfully")
    window.location = "http://localhost:8080/occ.html";
  });
}
