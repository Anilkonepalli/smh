<%@ include file="taglib.jsp"%>
<div id="maincontainer">
<div class="inner_tube" align="center" style="margin: 0px;">
<br><br>
<span class="title">Payment Form</span><br /><br>
<table width="89%" height="80%" border="0" cellpadding="0" cellspacing="0" style="font-family: sans-serif">
       <tr>
			<td>
			<form:form action="submitVoucher.htm" modelAttribute="outPayments"> 
			<c:set value="${outPayments.date}" var="date"></c:set>
			      <table width="98%" height="34%" bordercolor="#D8D8D8" cellpadding="0" cellspacing="0">
			        <tr height="33">
			          <td width="636"><form:label path="staffId"></form:label> <b></b></td>
			          <td width="315"></b> </td>
			        </tr>
			   		 <tr>
					    <td>Sum of in Rs</td>
					    <td><form:input path="amount"/><fmt:formatDate value="${date}" pattern="dd/MM/yyyy"/> </spam> </td> 
					 </tr>
					 <tr>
					    <td>to wards</td>
					    <td><form:textarea path="reason"/> </td>
					 </tr>
					 <tr>
					    <td>Paid to</td>
					    <td><input type="text" name="name"/></td>
					 </tr>
					 <tr>
					    <td>Payment mode</td>
					    <td>
					    	<form:select path="outPaymentTypeEnum">
					    		<form:option value="CH">Cheque</form:option>
					    		<form:option value="DD">DD</form:option>
					    		<form:option value="CA">Cash</form:option>
					    	</form:select> 
					    </td>
					 </tr>
					 <tr id="chqNo">
					    <td>Cheque No</td>
					    <td>
					    	<form:input path="chqNo"/>
					    </td>
					 </tr>
					 <tr id="ddNo">
					    <td>DD No</td>
					    <td>
					    	<form:input path="ddNo"/>
					    </td>
					 </tr>
					 <tr id="bankName">
					    <td>Bank Name</td>
					    <td>
					    	<form:input path="bankName"/>
					    </td>
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
