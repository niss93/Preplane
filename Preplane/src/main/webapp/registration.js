function getRegistred(){
  var first = document.getElementById("first").value
  var last = document.getElementById("last").value
  var pass =  document.getElementById("pass").value
  var status =  document.getElementById("status").value
  var id = Math.floor((Math.random() * 10) + 1);


  $.ajax({
    url: "http://localhost:9090/ws/preplane/user_r?id="+id+
    "&first="+first+
    "&name="+last+
    "&status="+status+
    "&password="+pass,

    dataType: "json",
    Type : "GET"
  })
  .done(function( data ) { console.log( "Got data", data );

    alert("You're registred successfully")
    window.location = "http://localhost:9090/signin.html";
  });
}
