<%@ include file="taglib.jsp" %>
<div id="maincontainer"><br>
<div class="inner_tube" align="left" style="margin: 0px;"> 
		    <div style="height:450px; overflow:auto"> 
		    <c:choose>
		    <c:when test="${!(empty patientTestList)}">
			    <table width="80%" height="30%" border="0"  bordercolor="#C0C0C0" cellpadding="0" cellspacing="0" align="center">
			    <c:forEach items="${patientTestList}" var="patientTest">
			    	 	<c:forEach var="patient" items="${patientTest.patientList}">
					      <tr>
					        <td><a href="${basePath}lab/viewTest.htm?id=${patient.id}">${patient.patientDetails.patientName}</a></td>
					      </tr>
				      </c:forEach>
			    </c:forEach>
			    </table>
			  </c:when>
	   	 <c:otherwise>
	    	<span class="title">No Patients are there to test</span><br /></div>
	    </c:otherwise>
	    </c:choose>
    </div>
</div>
