
function getNotification()
{
  var login = document.getElementById("username").value
  var pass =  document.getElementById("password").value
  sessionStorage.myName = login ;
  $.ajax({
    url: "http://localhost:8080/ws/preplane/user_v/"+login+"/"+pass,
    Type : "GET"
  })
  .done(function( data ) {
    console.log( "Got data", data ); // mettre tout le temps !!!
    if(data.ticket == true){
      window.location = "http://localhost:8080/occ.html";
    }
    if(data.ticket == false)
    {
      alert("Try again !")
    }
  });

}