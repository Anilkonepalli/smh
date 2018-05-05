<%@include file="taglib.jsp"%>
	<!--  ------------------Script and style for vertical tabs------------------  -->
		<script>
		$(function() {
			$( "#tabs" ).tabs().addClass( "ui-tabs-vertical ui-helper-clearfix" );
			$( "#tabs li" ).removeClass( "ui-corner-top" ).addClass( "ui-corner-left" );
		});
		
		</script>
		<style>
		.ui-tabs-vertical { width: 55em; }
		.ui-tabs-vertical .ui-tabs-nav { padding: .2em .1em .2em .2em; float: left; width: 12em; }
		.ui-tabs-vertical .ui-tabs-nav li { clear: left; width: 100%; border-bottom-width: 1px !important; border-right-width: 0 !important; margin: 0 -1px .2em 0; }
		.ui-tabs-vertical .ui-tabs-nav li a { display:block; }
		.ui-tabs-vertical .ui-tabs-nav li.ui-tabs-active { padding-bottom: 0; padding-right: .1em; border-right-width: 1px; border-right-width: 1px; }
		.ui-tabs-vertical .ui-tabs-panel { padding: 1em; float: right; width: 50em;}
		</style>
	<!-- ------------------end of vertical tabs code------------------ -->
	
<form:form action="submitTestValues.htm" modelAttribute="patientTestResult">
<input type="hidden" name="patientTest.id" value="${patientTest.id}"/>
<div id="tabs" style="width: 68em">
	<ul>
		<li><a href="#tabs-1">Hematology</a></li>
		<li><a href="#tabs-2">Micro-Biology</a></li>
		<li><a href="#tabs-3"> no 3</a></li>
	</ul>
	<div id="tabs-1">
			<table border="0" align="left" cellpadding="0" cellspacing="0">
			<tr> <b>
	 		   	<td> <b> Test Description </b> </td>
	 		   	<td> <b> Observed Values /&nbsp; Units</h2> </b> </td>
	 		   	<td> <b> Normal Ranges </b></td> 
	 		   </tr>
			 <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'Hematology'}">
	 		   <tr>
	 		   	<td width="50px"></td>
	 		   	<td> <h2>${test.description} &nbsp; (${test.testName})</h2> </td>
	 		   	<td> </td>
	 		   </tr>
				<c:forEach items="${test.testFields}" var="testField"> 
			 	<c:if test="${testField.fieldType eq 'hidden'}">
		 		<input type="${testField.fieldType}" name="${testField.propName}" value="${test.id}"/> 
		 		</c:if>
				<tr>
					<td width="150px">${testField.fieldName} </td>
					<td width="300px"> <input type="${testField.fieldType}" name="${testField.propName}"/> ${testField.units } &nbsp;&nbsp; <br>	</td>
					<td width="300px"> ${testField.normalRanges} </td> 
				</tr>
				
		 		</c:forEach>
		 		<c:if test="${!(empty test.testFeeList)}">
					<c:forEach items="${test.testFeeList}" var="childTest">
			 		  <c:if test="${childTest.category eq 'Hematology'}">
			 		   <tr>
			 		   	<td width="50px"></td>
			 		   	<td> <h2>${childTest.description} &nbsp; (${childTest.testName})</h2> </td>
			 		   	<td> </td>
			 		   </tr>
						<c:forEach items="${childTest.testFields}" var="childTestField"> 
					 	<c:if test="${childTestField.fieldType eq 'hidden'}">
				 		<input type="${childTestField.fieldType}" name="${testField.propName}" value="${test.id}"/> 
				 		</c:if>
						<tr>
							<td width="150px">${childTestField.fieldName} </td>
							<td width="300px"> <input type="${childTestField.fieldType}" name="${childTestField.propName}"/> ${childTestField.units } &nbsp;&nbsp; <br>	</td>
							<td width="300px"> ${childTestField.normalRanges} </td> 
						</tr>
				 		</c:forEach>
				 		
						</c:if>
					</c:forEach>
				</c:if>
				</c:if>
			</c:forEach>
			</table>
	</div>
	<div id="tabs-2">
			<c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'Micro-Biology'}">
	 		  <h2>${test.description} &nbsp; (${test.testName})</h2>
				 <c:forEach items="${test.testFields}" var="testField"> 
			 	<c:if test="${testField.fieldType eq 'hidden'}">
		 		<input type="${testField.fieldType}" name="${testField.propName}" value="${test.id}"/> 
		 		</c:if>
				<table border="0">
				<tr>
					<td width="100">${testField.fieldName} </td>
					<td>: <input type="${testField.fieldType}" name="${testField.propName}"/> <br>	</td>
				</tr>
				</table>			 
		 		</c:forEach>
				</c:if>
			</c:forEach>
			<div data-role="content">
       			 <a id="button">Print</a>
      		</div>
	</div>
	<div id="tabs-3">
		<table border="0" align="left" cellpadding="0" cellspacing="0">
			<tr> <b>
	 		   	<td> <b> Test Description </b> </td>
	 		   	<td> <b> Observed Values /&nbsp; Units</h2> </b> </td>
	 		   	<td> <b> Normal Ranges </b></td> 
	 		   </tr>
			 <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'ClinicalPathology'}">
	 		   <tr>
	 		   	<td width="50px"></td>
	 		   	<td> <h2>${test.description} &nbsp; (${test.testName})</h2> </td>
	 		   	<td> </td>
	 		   </tr>
				<c:forEach items="${test.testFields}" var="testField"> 
			 	<c:if test="${testField.fieldType eq 'hidden'}">
		 		<input type="${testField.fieldType}" name="${testField.propName}" value="${test.id}"/> 
		 		</c:if>
				<tr>
					<td width="150px">${testField.fieldName} </td>
					<td width="300px"> <input type="${testField.fieldType}" name="${testField.propName}"/> ${testField.units } &nbsp;&nbsp; <br>	</td>
					<td width="300px"> ${testField.normalRanges} </td> 
				</tr>
				
		 		</c:forEach>
		 		<c:if test="${!(empty test.testFeeList)}">
					<c:forEach items="${test.testFeeList}" var="childTest">
			 		  <c:if test="${childTest.category eq 'ClinicalPathology'}">
			 		   <tr>
			 		   	<td width="50px"></td>
			 		   	<td> <h2>${childTest.description} &nbsp; (${childTest.testName})</h2> </td>
			 		   	<td> </td>
			 		   </tr>
						<c:forEach items="${childTest.testFields}" var="childTestField"> 
					 	<c:if test="${childTestField.fieldType eq 'hidden'}">
				 		<input type="${childTestField.fieldType}" name="${testField.propName}" value="${test.id}"/> 
				 		</c:if>
						<tr>
							<td width="150px">${childTestField.fieldName} </td>
							<td width="300px"> <input type="${childTestField.fieldType}" name="${childTestField.propName}"/> ${childTestField.units } &nbsp;&nbsp; <br>	</td>
							<td width="300px"> ${childTestField.normalRanges} </td> 
						</tr>
				 		</c:forEach>
				 		
						</c:if>
					</c:forEach>
				</c:if>
				</c:if>
			</c:forEach>
			</table>
	<p><input  type="submit"/></p>
	</div>
</div>
</form:form>
<!--  
<div id="maincontainer">
<div class="column">
<form:form action="submitTestValues.htm" modelAttribute="patientTestResult">
<input type="hidden" name="patientTest.id" value="${patientTest.id}"/>
<div class="portlet">
	<div class="portlet-header">Hemotology</div>
	  <c:forEach items="${patientTest.testFee}" var="test">
	   <c:if test="${test.category eq 'Hematology'}">
		<div class="portlet-content">
		 <c:forEach items="${test.testFields}" var="testField"> 
		 	<c:if test="${testField.fieldType eq 'hidden'}">
		 		<input type="${testField.fieldType}" name="${testField.propName}" value="${test.id}"/> 
		 	</c:if>
			${testField.fieldName} &nbsp;&nbsp;&nbsp;&nbsp; <input type="${testField.fieldType}" name="${testField.propName}"/> <br>			 
		 </c:forEach>
		</div>
		</c:if>
		</c:forEach>
	</div>
	<input  type="submit"/>
</form:form>
</div>
</div> -->