<%@include file="taglib.jsp"%>
<style>
	#maincontainer.div-spacer { float: none; height: 500px; overflow: auto;}
</style>

<script type="text/javascript">
$(document).ready(function() {

		$("#button").click(function()
           {
             $("#printTest").print();
           });
});
</script>
<div id="maincontainer" class="div-spacer">
<div class="inner_tube" align="left" style="margin: 1px;">
<form:form action="submitTestValues.htm" modelAttribute="patientTestResult">
<input type="hidden" name="patientTestId" value="${patientTest.id}"/>
<div id="printTest">
<table  border="0" cellpadding="0" cellspacing="0" style="font-family: sans-serif" >
      <tr align="center">
        <td align="right">
	      <table width="945" height="73" border="0" cellpadding="0" cellspacing="10">
	      <tr>
	      	<td>
	      	</td>
	      	<td>
	      		<b> Hematology </b>
	      	</td>
	      	<td>
	      	</td>
	      </tr>
	      <tr>
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
          </td>
      </tr>
      <tr>
      	 <td align="right">
	      <table width="945" height="73" border="0" cellpadding="0" cellspacing="10">
	        <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'BIO-CHEMISTRY'}">
	      <tr>
	      	<td>
	      	</td>
	      	<td>
	      		<b> BIO-CHEMISTRY </b>
	      	</td>
	      	<td>
	      	</td>
	      </tr>
	      </c:if>
	      </c:forEach>   
          <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'BIO-CHEMISTRY'}">
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
			 		  <c:if test="${childTest.category eq 'BIO-CHEMISTRY'}">
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
          </td>
      </tr>
       <tr>
      	 <td align="right">
	      <table width="945" height="73" border="0" cellpadding="0" cellspacing="10">
	        <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'ClinicalPathology'}">
	      <tr>
	      	<td>
	      	</td>
	      	<td>
	      		<b> ClinicalPathology </b>
	      	</td>
	      	<td>
	      	</td>
	      </tr>
	      </c:if>
	      </c:forEach>   
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
          </td>
      </tr>
       <tr>
      	 <td align="right">
	      <table width="945" height="73" border="0" cellpadding="0" cellspacing="10">
	        <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'Serology'}">
	      <tr>
	      	<td>
	      	</td>
	      	<td>
	      		<b> Serology </b>
	      	</td>
	      	<td>
	      	</td>
	      </tr>
	      </c:if>
	      </c:forEach>   
          <c:forEach items="${patientTest.testFee}" var="test">
	 		  <c:if test="${test.category eq 'Serology'}">
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
			 		  <c:if test="${childTest.category eq 'Serology'}">
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
          </td>
      </tr>
</table>
</div>
<input type="submit" />
<div data-role="content">
 <a id="button">Print</a>
</div>

</form:form>
</div>
</div>