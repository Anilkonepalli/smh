<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>Login Page</title>
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
	
#logindiv {
	border:#666666 solid 1px;
	width:300px;
	height:300px;
	margin-right:auto;
	margin-left:auto;
	border-radius:25px;
	padding:15px;
	background-color: #EEEEE0;
	-moz-box-shadow: 0 0 30px 5px #999;
	-webkit-box-shadow: 0 0 30px 5px #999;
	}
</style>

<body onload='document.f.j_username.focus();'>
  <table height="100%" width="100%" align="center" border="0" >
   <tr align="center">
   <td>  
    <div id="logindiv">
	<h3>Login with Username and Password (Custom Page)</h3>

	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>

	<form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'>
		<table align="center" cellpadding="0">
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2' align="center"><input name="submit" type="submit"
					value="submit" />
				</td>
				<td colspan='2' align="center"><input name="reset" type="reset" />
				</td>
			</tr>
			
		</table>

	</form>
	</div>
	  </td>
	</tr>
	</table> 
 </body>
