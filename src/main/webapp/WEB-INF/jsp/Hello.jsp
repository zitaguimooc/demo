<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello every one, jsp test!</title>
<script language="javascript" type="text/javascript">
var code; //在全局 定义验证码
function createCode() {
	  code = "";
	  var codeLength = 6;//验证码的长度  
	  var checkCode = document.getElementById("checkCode");
	  var selectChar = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//所有候选组成验证码的字符，当然也可以用中文的  
	  
	  for (var i = 0; i < codeLength; i++) {
	    var charIndex = Math.floor(Math.random() * 36);
	    code += selectChar[charIndex];
	  }
	  //alert(code);
	  if (checkCode) {
	    checkCode.className = "code";
	    checkCode.value = code;
	  }
	}
	
	function validate() {
	  var inputCode = document.getElementById("input1").value;
	  if (inputCode.length <= 0) {
	    alert("Please input captcha!");
	  } else if (inputCode != code) {
	    alert("Wrong Captcha!");
	  createCode();//刷新验证码  
	  } else {
	  alert("^-^ OK");
	  }
	}
</script>
</head>
<body>
	<h1>Register</h1>

	<!-- <div class="input-group">
  		<span class="input-group-addon" id="basic-addon1">User@</span>
 	 	<input id="userName" type="text" class="form-control" placeholder="User" aria-describedby="basic-addon1">
	</div>
	<br>
		<div class="input-group">
  			<span class="input-group-addon" id="basic-addon1">Password@</span>
  			<input id="passWord" type="text" class="form-control" placeholder="Password" aria-describedby="basic-addon1">
		</div>
	<br>
	<button type="button" style="width:100px;" class="btn btn-default">Login</button> -->
	
	<form action="login" method="post">
		User <input type="text" name="username">
		Password <input type="password" name="password">
		<br>
		<input type="text" id="input1">
		<input type="text" id="checkCode" readonly="readonly" style="width: 80px" onclick="createCode()">
		<input type="button" id="Button1" value="check" onclick="validate();"/>
		<br>
		<input type="submit" value="register now">
	</form>
	<script language="javascript" type="text/javascript" 
			src="./main/webapp/WEB-INF/jsp/1.js"></script>
	<!-- main/webapp/WEB-INF/jsp/1.js 
	C:\Users\zitagu\Downloads\demo\demo\src\main\webapp\WEB-INF\jsp\1.js-->
</body>
</html>