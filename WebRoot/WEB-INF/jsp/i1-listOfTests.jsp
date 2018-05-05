<%@include file="taglib.jsp"%>
<style>
	#maincontainer.div-spacer { float: none; height: 500px; overflow: auto;}
</style>
<div id="maincontainer" class="div-spacer">
<div class="inner_tube" align="left" style="margin: 1px;">
<form:form action="submitTest.htm" modelAttribute="patientModel"> 
<div class="column" >
<form:hidden path="id" value="${patient.id}"/> 
	<div class="portlet">
	<div class="portlet-header">Hemotology</div>
	  <c:forEach items="${testList}" var="test">
	   <c:if test="${test.category eq 'Hematology' && test.individualTestEnum eq 'Y'}">
		<div class="portlet-content">
		<!-- <c:forEach items="${test.testFields}" var="testField"> 
			${testField.fieldName} &nbsp;&nbsp;&nbsp;&nbsp; <input type="${testField.fieldType}" name="${testField.fieldName}"/> <br>			 
		 </c:forEach>
		 -->
		 <form:checkbox path="testIds" value="${test.id}"/>${test.testName}
		</div>
		</c:if>
		</c:forEach>
	</div>
	
</div>
<div class="column">
	<div class="portlet">
	<div class="portlet-header">Micro-Biology</div>
	  <c:forEach items="${testList}" var="test">
	   <c:if test="${test.category eq 'Micro-Biology'}">
		<div class="portlet-content">
		<!-- <c:forEach items="${test.testFields}" var="testField"> 
			${testField.fieldName} &nbsp;&nbsp;&nbsp;&nbsp; <input type="${testField.fieldType}" name="${testField.fieldName}"/> <br>			 
		 </c:forEach>
		 -->
		 <form:checkbox path="testIds" value="${test.id}"/>${test.testName}
		</div>
		</c:if>
		</c:forEach>
	</div>
	</div>
<div class="column" >
<form:hidden path="id" value="${patient.id}"/> 
	<div class="portlet">
	<div class="portlet-header">BIO-CHEMISTRY</div>
	  <c:forEach items="${testList}" var="test">
	   <c:if test="${test.category eq 'BIO-CHEMISTRY' && test.individualTestEnum eq 'Y'}">
		<div class="portlet-content">
		<!-- <c:forEach items="${test.testFields}" var="testField"> 
			${testField.fieldName} &nbsp;&nbsp;&nbsp;&nbsp; <input type="${testField.fieldType}" name="${testField.fieldName}"/> <br>			 
		 </c:forEach>
		 -->
		 <form:checkbox path="testIds" value="${test.id}"/>${test.testName}
		</div>
		</c:if>
		</c:forEach>
	</div>
	
</div>
<div class="column" >
<form:hidden path="id" value="${patient.id}"/> 
	<div class="portlet">
	<div class="portlet-header">ClinicalPathology</div>
	  <c:forEach items="${testList}" var="test">
	   <c:if test="${test.category eq 'ClinicalPathology' && test.individualTestEnum eq 'Y'}">
		<div class="portlet-content">
		<!-- <c:forEach items="${test.testFields}" var="testField"> 
			${testField.fieldName} &nbsp;&nbsp;&nbsp;&nbsp; <input type="${testField.fieldType}" name="${testField.fieldName}"/> <br>			 
		 </c:forEach>
		 -->
		 <form:checkbox path="testIds" value="${test.id}"/>${test.testName}
		</div>
		</c:if>
		</c:forEach>
	</div>
	
</div>
<div class="column" >
<form:hidden path="id" value="${patient.id}"/> 
	<div class="portlet">
	<div class="portlet-header">Serology</div>
	  <c:forEach items="${testList}" var="test">
	   <c:if test="${test.category eq 'Serology' && test.individualTestEnum eq 'Y'}">
		<div class="portlet-content">
		<!-- <c:forEach items="${test.testFields}" var="testField"> 
			${testField.fieldName} &nbsp;&nbsp;&nbsp;&nbsp; <input type="${testField.fieldType}" name="${testField.fieldName}"/> <br>			 
		 </c:forEach>
		 -->
		 <form:checkbox path="testIds" value="${test.id}"/>${test.testName}
		</div>
		</c:if>
		</c:forEach>
	</div>
	
</div>
	<input  type="submit"/>
</form:form>
</div>
</div>