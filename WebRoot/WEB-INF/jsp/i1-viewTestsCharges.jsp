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
			<form:form action="/smh/payment/makePayment.htm" modelAttribute="inPayment">    
			      <table width="98%" height="34%" bordercolor="#D8D8D8" cellpadding="0" cellspacing="0">
			        <tr height="33" bgcolor="#D8D8D8">
			          <td width="636"><b>&emsp;&emsp;&emsp;TESTS</b></td>
			          <td width="315"><b>AMOUNT</b></td>
			        </tr>
			        <c:forEach items="${patientTest.testFee}" var="test">
							<tr>
			         		 	<td height="33"> &emsp;&emsp;&emsp;${test.testName}</td>
			         		 	<td>${test.fee}</td>
			       			</tr>							
						</c:forEach>
			 	    </table>	 
			        <p align="center">
			        <input type="hidden" value="T" name="paymentTypeEnum" >
			        <input type="hidden" value="${patient.id}" name="patient.id" >
					<input type="hidden" value="${totFee}" name="totalAmount"/>
					<input  type="submit"/>
					</p>
				</form:form>
		     </td>
       </tr>
</table>
      
<br><br>
</div>
</div>
