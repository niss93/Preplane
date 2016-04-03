function deleteFlight(){

  var departure = document.getElementById("departure").value
  var departure_time =  document.getElementById("departure_time").value
  var commercial_no = document.getElementById("commercial_no").value
 
  $.ajax({
    url: "http://localhost:9090/ws/preplane/flight/+"+departure_time+"/"+departure+"/"+commercial_no,
    Type : "GET"
  })
  .done(function( data ) {
    console.log( "Got data", data );
    alert("Flight deleted successfully")
    window.location = "http://localhost:9090/occ.html";
  });
}
