<%@ include file="taglib.jsp"%>
<style>
#tabs.tabs-spacer { float: none; height: 450px; overflow: auto;}
</style>
<div id="maincontainer"><br>
<div class="inner_tube" align="center" style="margin: 15px;"> <span class="title">Patient DashBoard </span><br /> 
    <table width="89%" height="89%" border="0" cellpadding="0" cellspacing="0" style="font-family: sans-serif">
       <!-- <tr>
	      <td> <b><a href= "${basePath}payment/makePayment.htm?id=${patient.id}">Payment</a></b>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		   <b><a href="${basePath}lab/listOfTests.htm?id=${patient.id}">Labs</a></b></td>
	     </tr>
	    -->  
      <tr>
        <td height="25px">
	      <table width="945" height="73" border="0" cellpadding="0" cellspacing="10">
            <tr align="left">
              <td width="100"><b>Name :</b></td> <td width="200">${patient.patientDetails.patientName} </td>
              <td width="100"><b>Id :</b> </td> <td width="200"> ${patient.patientTypeEnum}-${patient.id} </td>
              <td width="100"><b>Age :</b> </td> <td width="200"> ${patient.patientDetails.age} </td>
              <td width="200">  <b><a href= "${basePath}payment/fwdToMakePayment.htm?id=${patient.id}" class="aButton">Make Payment</a></b>  </td>
            </tr>
            <tr align="left">
              <td width="100"><b>Ref By :</b> </td> <td width="331"> ${patient.refBy}  </td>
              <td width="100"><b>Date :</b> </td> <td width="331"> ${patient.registrationDate} </td>
              <td width="100"><b>Type :</b> </td> <td width="331"> ${patient.patientTypeEnum}
              <td width="200"> <b><a href="${basePath}lab/listOfTests.htm?id=${patient.id}" class="aButton">Lab Test Form</a></b> </td>
              <!--  <input type="submit" id="subButton"/>    -->     </td>
            </tr>
          </table>
          </td>
      </tr>
 
    </table>

<div id="tabs" class="tabs-spacer">
	<ul>
		<li><a href="#tabs-1">Lab Reports</a></li>
		<li><a href="#tabs-2">Payment Details</a></li>
	</ul>
	<div id="tabs-1">
		<p>
			 <table width="98%" height="34%"cellpadding="0" cellspacing="0">
			       
			        <tr>
			        <td>
				       	 <c:forEach items="${testResult}" var="result">
				         		<c:forEach items="${result.patientTest.testFee}" var="testFee">
				         		<c:if test="${testFee.testName eq 'PT'}">
				         		<p><b>PT</b> </p>
				         		<table>
					         		<tr>
					         		<td>
					         		 Test : 	 <br>
					         		 </td>
					         		 <td>
					         		 ${result.ptTest.test}
					         		 </td>
					         		 </tr>
					         		 <tr>
					         		 <td>
					         		  Control :
					         		 </td>
					         		 <td>
					         		 ${result.ptTest.contorl}
					         		 </td>
					         		</tr> 
					         		</table>
				         	</c:if> 
				         	<c:if test="${testFee.testName eq 'Stool Routine'}">
				         		<p><b>Stool Routine</b> </p>
				         		<table>
					         		<tr>
					         		<td>
					         		 Macroscopic : 	 <br>
					         		 </td>
					         		 <td>
					         		 ${result.stollTest.macroscopic}
					         		 </td>
					         		 </tr>
					         		 <tr>
					         		 <td>
					         		  Reaction :
					         		 </td>
					         		 <td>
					         		 ${result.stollTest.reaction}
					         		 </td>
					         		</tr> 
					         		</table>
				         	</c:if> 
				         	</c:forEach>
						</c:forEach>
						
					</td>
					</tr>
			 </table>
		</p>
	</div>
	<div id="tabs-2">
	 <c:if test="${!(empty paymentList)}">
		 <table width="98%" height="34%" bordercolor="#D8D8D8" cellpadding="0" cellspacing="0">
			        <tr height="33" bgcolor="#D8D8D8">
			          <td width="636"><b>&emsp;&emsp;&emsp;Payment Date</b></td>
			          <td width="315"><b>Payment Type</b></td>
			           <td width="315"><b>Amount</b></td>
			        </tr>
			        <c:forEach items="${paymentList}" var="payment">
							<tr>
			         		 	<td height="33"> &emsp;&emsp;&emsp;  <fmt:formatDate pattern="dd/MM/yyyy" value="${payment.paymetnDate}"/> </td>
			         		 	<td>${payment.paymentTypeEnum}</td>
			         		 	<td>${payment.paymentAmt}</td>
			       			</tr>							
						</c:forEach>
		 </table>
		 </c:if>
	</div>
</div>
</div><br><br>
</div>
