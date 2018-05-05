<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ include file="taglib.jsp"%>
	<div id="maincontainer">
    <div id="top_section">
    
    <div class="header_left">  </div>
        
        <div class="header_right">
        	
        	<div align="right" style="margin: 0px 10px 10px 0px;">
        	<b> Welcome   ${sessionScope.name} </b> &nbsp;&nbsp;&nbsp;&nbsp;
        	<a href="${basePath}j_spring_security_logout">Logout</a> <br>
            <a href="${basePath}home/home.htm" > <img src="../images/HomeButton.jpg" height="50px" width="70px"> </a> 
            
            </div>
		
        </div>
    	
    </div>
	<div class="line"></div>
	<div class="glossymenu"> 
	<table  height="49" width="945">
	<tr>
	  
		<td width="295"><b>Search By:</b> Name:
		  <input type="text" id="patientName"/><td width="201">Id:
		  <input name="text" type="text" id="id"/></td> 
	    <td width="224">Date:
	      <input name="text2" type="text"/></td>
	    <td width="78"><input name="submit" type="submit"/></td>
		<td width="148" align="center"><a href="${basePath}patient/registerPatient.htm"><img src="../images/Register.png" alt="s" width="108" height="33" /></a></td>
	</tr>
	</table>
	</div>