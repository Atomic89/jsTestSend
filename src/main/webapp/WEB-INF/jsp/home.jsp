<%--
  Created by IntelliJ IDEA.
  User: Expanium
  Date: 04.01.2019
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="../../resources/js/jquery.serializejson.js"></script>
</head>
<body>
<form method="post" id="form" action="home" name="form">
    Номер автомобиля:<input type="text" id="number" name="number"><br><br>
    Марка:<input type="text" id="mark" name="mark"><br><br>
    Год выпуска:<input type="text" id="year" name="year"><br><br>
    Название организации:<input type="text" id="nameOrg" name="nameOrg"><br><br>
    <input type = "submit" id="submit" >
</form>
<label id="label1"></label>
</body>
</html>

<script>
    $(document).ready(function() {

        // SUBMIT FORM
        $("#form").submit(function(event) {
            // Prevent the form from submitting via the browser.
            event.preventDefault();
            ajaxPost();
        });


        function ajaxPost(){

            // PREPARE FORM DATA
            var formdata =$('form').serializeJSON();

            // DO POST
            $.ajax({
                type : "POST",
                contentType : 'application/json; charset=utf-8',
                url : "home",
                data : JSON.stringify(formdata),
                dataType : 'json',
                success : function(result) {
                    if(result.status == "OK"){
                       // alert("igm");
                      document.getElementById("label1").innerHTML = result.status.toString();
                    }else{
                        alert("error");
                    }
                    console.log(result);
                },
                error : function(e) {
                    alert("Error!");
                    console.log("ERROR: ", e);
                }
            });

            // Reset FormData after Posting
        }


    })

</script>
