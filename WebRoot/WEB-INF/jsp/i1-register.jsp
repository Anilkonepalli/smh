<%@ include file="taglib.jsp"%>

<form:form action="submitPatient.htm" modelAttribute="patient">
<div id="maincontainer"><br>
<div class="inner_tube" align="center" >
    <table width="897" height="369" border="0" cellpadding="0" cellspacing="0" id="content">
	          <tr>
			          <td height="39" colspan="4" align="center"><h1 style="color: green; font-size: large">Register</h1></td>
     		 </tr>
	          <tr>
	            <td width="220" height="39"><strong>Type</strong></td>
	            <td width="232"><form:select path="patientTypeEnum">
	              <form:options />
	              </form:select>
			    <!--<c:out value="${patient.registrationDate}" /> --></td>
	            <td width="220"><strong>Registration Date</strong></td>
	            <td width="225"><form:hidden path="registrationDate" /> <fmt:formatDate pattern="dd/MM/yyyy HH:MM" value="${patient.registrationDate}"/> </td>
              </tr>
	          <tr>
	            <td height="39"><strong>Patient Name </strong></td>
	            <td><form:input path="patientDetails.patientName"/></td>
	            <td><strong>Age </strong> <form:input path="patientDetails.age" /></td>
	            <td><strong>Sex </strong> <form:select path="PatientDetails.GenderEnum">
	              <form:options />
	              </form:select></td>
              </tr>
              <tr>
	       		 <td height="44"><strong>Gaurdian's Name</strong></td>
	             <td><form:input path="patientDetails.guardianName" /></td>
	             <td><strong>Marital Status</strong></td>
	             <td><form:select path="PatientDetails.MaritalStatusEnum">
	              <form:options />
	              </form:select></td>
              </tr>
	          <tr>
	            <td height="44"><strong>City/Town/Mandal/Village</strong></td>
	            <td><form:input path="patientDetails.city" /></td>
	            <td><strong>Address</strong></td>
	            <td><form:textarea path="patientDetails.address" rows="2" cols="0"/> </td>
              </tr>
	          
	          <tr>
	          	 <td height="44"><strong>Patient/Gurdian Phone No</strong></td>
	            <td><form:input path="patientDetails.contactNo" /></td>
	            <td><strong>Cosultant</strong></td>
	            <td><form:select path="consultant.id">
	              <c:forEach  var="consultant" items="${consultantsList}">
	                <form:option value="${consultant[0]}">
	                  <c:out value="${consultant[1]}">
	                  </c:out>
                    </form:option>
                  </c:forEach>
	              </form:select></td>
              </tr>
	          <tr>
	            <td height="45"><strong>Ref by </strong></td>
	            <td><form:input path="refBy"/></td>
	            <td><strong>Ref Doctor Phone No</strong></td>
	            <td><form:input path="refDocPh" /></td>
              </tr>
	          <tr>
	            <td height="39"><strong>Ward</strong></td>
	            <td><form:select path="bed.id">
	              <c:forEach  var="ward" items="${wardList}">
	                <form:option value="${ward.id}">
	                  <c:out value="${ward.description}">
	                  </c:out>
                    </form:option>
                  </c:forEach>
	              </form:select></td>
	            <td><strong>Bed</strong></td>
	            <td><form:select path="bed.id">
	              <c:forEach  var="beds" items="${bedsList}">
	                <form:option value="${beds[0]}">
	                  <c:out value="${beds[1]}">
	                  </c:out>
                    </form:option>
                  </c:forEach>
	              </form:select></td>
      </tr>
	          <tr>
	            <td height="46" colspan="4" align="center"><input  type="submit"/></td>
              </tr>
            </table>
  </div><br><br>
</div>
</form:form>