<%@ include file="taglib.jsp"%>
<style>
#maincontainer.div-spacer { float: none; height: 500px; overflow: auto;}
</style>
<div id="maincontainer" class="div-spacer">
<div class="inner_tube" align="center" style="margin: 0px;">
<br><br>
<span class="title">Payment Form</span><br /><br>
<table width="89%" height="80%" border="0" cellpadding="0" cellspacing="0" style="font-family: sans-serif">
      <tr>
        <td height="25px">
	      <table width="945" height="73" border="0" cellpadding="0" cellspacing="10">
            <tr align="left">
              <td width="100"><b>Name :</b></td> <td width="200">${patient.patientDetails.patientName} </td>
              <td width="100"><b>Id :</b> </td> <td width="200"> ${patient.patientTypeEnum}-${patient.id} </td>
              <td width="100"><b>Age :</b> </td> <td width="200"> ${patient.patientDetails.age} </td>
            </tr>
            <tr align="left">
              <td width="100"><b>Ref By :</b> </td> <td width="331"> ${patient.refBy}  </td>
              <td width="100"><b>Date :</b> </td> <td width="331"> ${patient.registrationDate} </td>
              <td width="100"><b>Type :</b> </td> <td width="331"> ${patient.patientTypeEnum}
              <!--  <input type="submit" id="subButton"/>    -->     </td>
            </tr>
          </table>
          </td>
      </tr>
      <tr>
			<td>
			<form:form action="submitPayment.htm" modelAttribute="inPayment"> 
			<form:hidden path="patient.id"  value="${patient.id}"/>
			      <table width="98%" height="34%" bordercolor="#D8D8D8" cellpadding="0" cellspacing="0">
			        <tr height="33" bgcolor="#D8D8D8" >
			          <td width="636" ><b>&emsp;&emsp;&emsp;TESTS</b></td>
			          <td width="315"><b>AMOUNT</b></td>
			        </tr>
			   		 <tr>
					    <td >Total Amount</td>
					    <td><form:input path="totalAmount"/> </td>
					 </tr>
					 <tr>
					    <td>Discount</td>
					    <td><input type="text" value="0" id="discount"/> <b><font face='Verdana' size='2'><span id='balance'>${inPayment.totalAmount}</span></font></b></td>
					 </tr>
					 <tr>
					    <td>Amount to be paid</td>
					    <td><input type="text" name="paymentAmt" id="paymentAmt"/></td>
					 </tr>
					 <tr>
					    <td>Due</td>
					    <td><input type="text" name="due" id="due"/></td>
					 </tr>
					 <tr>
					    <td height="51" colspan="2" align="center"><input type="submit" name="submit" /></td>
					 </tr>
			      </table>	 
			      </form:form>
		     </td>
       </tr>
</table>
      
<br><br>
</div>
</div>
