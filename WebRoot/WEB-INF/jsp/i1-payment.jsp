<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<div id="maincontainer">
<div class="inner_tube" align="center" style="margin: 0px;">
<br><br>
<div class="inner_tube" align="center" style="margin: 15px;">
<span class="title">Payment Form</span><br /><br />
<p>-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>
<table width="89%" height="78%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="110"><table width="940" height="65" border="0" cellpadding="0" cellspacing="0">
      <tr align="left">
        <td width="331"><b>Name :</b> ${patient.patientDetails.patientName} </td>
        <td width="306"> <b>Id :</b> 120214-0009 </td>
        <td width="303"><b>Age :</b> ${patient.patientDetails.age} </td>
      </tr>
      <tr align="left">
        <td><b>Ref By :</b> Sanjay Bhansali </td>
        <td><b>Date :</b> 14 Feb 2013 </td>
        <td>&nbsp;</td>
      </tr>
    </table>
      <p > &emsp;--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p></td>
  </tr>
  
	<tr>
	<td>
      <table width="98%" height="34%" bgcolor="#D8D8D8" cellpadding="0" cellspacing="0">
        <tr height="33" bgcolor="#00CCFF">
          <td width="636"><b>&emsp;&emsp;&emsp;TESTS</b></td>
          <td width="315"><b>AMOUNT</b></td>
        </tr>
        <tr>
          <td height="33"> &emsp;&emsp;&emsp;X-RAY</td>
          <td>200.00</td>
        </tr>
        <tr>
          <td height="33">&emsp;&emsp;&emsp;SEMEN ANALYSIS </td>
          <td>500.00</td>
        </tr>
        <tr>
          <td height="33">&emsp;&emsp;&emsp;FLUID ANALYSIS </td>
          <td>500.00</td>
        </tr>
        <tr>
          <td height="33">&emsp;&emsp;&emsp;WIDAL</td>
          <td>400.00</td>
        </tr>
        <tr>
          <td height="33" >&emsp;&emsp;&emsp;<strong>TOTAL AMOUNT</strong></td>
          <td><strong>1600.00</strong></td>
        </tr>
      </table>	  </td>
  </tr>
</table>
	
	
<p>&nbsp;</p>
<p><br>
  <br>
</p>
</div>
</div>

