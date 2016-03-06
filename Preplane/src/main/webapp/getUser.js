$.ajax({
  url: "http://localhost:8080/ws/preplane/users",
  dataType: "json",
  Type : "GET"
})
.done(function( data ) {
  console.log( "Got data", data );
  data.forEach(function(user) {
    $("#user").append('<tr class="success"><td>'+'Firstname: '+user['name']+'<br>'+'Lastname: '+user['firstName']+'<br>'+'Status: '+user['crewStatus']+' Member')});
});
