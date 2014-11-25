<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<title>Demo JQuery Application</title>
</head>
<body>

	<div style="text-align: center;">
	<div style="box-sizing: border-box; display: inline-block; width: auto; max-width: 480px; background-color: #FFFFFF; border: 2px solid #0361A8; border-radius: 5px; box-shadow: 0px 0px 8px #0361A8; margin: 50px auto auto;">
	<div style="background: #0361A8; border-radius: 5px 5px 0px 0px; padding: 15px;"><span style="font-family: verdana,arial; color: #D4D4D4; font-size: 1.00em; font-weight:bold;">Enter your login and password</span></div>
	<div style="background: ; padding: 15px">
	<style type="text/css" scoped>
	td { text-align:left; font-family: verdana,arial; color: #064073; font-size: 1.00em; }
	input { border: 1px solid #CCCCCC; border-radius: 5px; color: #666666; display: inline-block; font-size: 1.00em;  padding: 5px; width: 100%; }
	input[type="button"], input[type="reset"], input[type="submit"] { height: auto; width: auto; cursor: pointer; box-shadow: 0px 0px 5px #0361A8; float: right; margin-top: 10px; }
	table.center { margin-left:auto; margin-right:auto; }
	.error { font-family: verdana,arial; color: #D41313; font-size: 1.00em; }
	</style>
<!-- <form method="post" action="/auth/login/" name="myform" target="_top"> -->
<input type="hidden" name="action" value="login">
<input type="hidden" name="hide" value="">
<table class='center'>
<tr><td>UserName : </td><td><input type="text" name="userName" id="userName"></td></tr>
<tr id="userNameErrorMsg"></tr>
<tr><td>Password : </td><td><input type="password" name="password" id="password"></td></tr>
<tr id="passwordErrorMsg"></tr>
<tr><td>&nbsp;</td><td><input type="submit" value="Login" id="submitButton"></td></tr>
<tr><td colspan=2>&nbsp;</td></tr>
<tr><td colspan=2>Lost your username or password? Find it <a href="/auth/deluxe/?action=lost">here</a>!</td></tr>
<tr><td colspan=2>Not member yet? Click <a href="auth/register">here</a> to register.</td></tr>
</table>
<!--   /form> -->
</div></div></div>


<script type="text/javascript">
$("#submitButton").bind("click",function() {
	var userNameVal = $("#userName").val();
	var passwordVal = $("#password").val();
	var loginRequest = {'userName' : userNameVal,'password' : passwordVal};
	
	$.ajax({
	    url: "multiplex/LoginService/authenticate",
	    type: 'POST',
	    data: JSON.stringify(loginRequest),
	    contentType: 'application/json; charset=utf-8',
	    dataType: 'json',
	    async: false,
	    success: function(data) {
	    	
			if(data.success) {
				$("#userNameErrorMsg").hide();
				$("#passwordErrorMsg").hide();
				alert("You are Authenticated Now");
			} else {
				$("#userNameErrorMsg").show();
				$("#passwordErrorMsg").show();
				$("#userNameErrorMsg").html(data.userNameError);
				$("#passwordErrorMsg").html(data.passwordError);
			}
	    }
	});	
	
});

</script>


</body>
</html>
