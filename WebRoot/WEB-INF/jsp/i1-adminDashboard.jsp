<%@ include file="taglib.jsp"%>
<style>
	    #tabs.tabs-spacer { float: none; height: 500px; overflow: auto;}
		body { font-size: 62.5%; }
		input.text { margin-bottom:12px; width:95%; padding: .4em; }
		fieldset { padding:0; border:0; margin-top:25px; }
		h1 { font-size: 1.2em; margin: .6em 0; }
		div#users-contain { width: 450px; margin: 20px 0; }
		div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
		div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
		.ui-dialog .ui-state-error { padding: .3em; }
		.validateTips { border: 1px solid transparent; padding: 0.3em; }
		div#inpayments-contain { width: 450px; margin: 20px 0; }
		div#inpayments-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
		div#inpayments-contain table td, div#inpayments-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
		div#outpayments-contain { width: 450px; margin: 20px 0; }
		div#outpayments-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
		div#outpayments-contain table td, div#outpayments-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
		div#patients-contain { width: 300px; margin: 20px 0; }
		div#patients-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
		div#patients-contain table td, div#patients-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }			 		
</style>
<script>
	
	$(function() {
		var name = $( "#name" ),
			email = $( "#email" ),
			password = $( "#password" ),
			allFields = $( [] ).add( name ).add( email ).add( password ),
			tips = $( ".validateTips" );

		function updateTips( t ) {
			tips
				.text( t )
				.addClass( "ui-state-highlight" );
			setTimeout(function() {
				tips.removeClass( "ui-state-highlight", 1500 );
			}, 500 );
		}

		function checkLength( o, n, min, max ) {
			if ( o.val().length > max || o.val().length < min ) {
				o.addClass( "ui-state-error" );
				updateTips( "Length of " + n + " must be between " +
					min + " and " + max + "." );
				return false;
			} else {
				return true;
			}
		}

		function checkRegexp( o, regexp, n ) {
			if ( !( regexp.test( o.val() ) ) ) {
				o.addClass( "ui-state-error" );
				updateTips( n );
				return false;
			} else {
				return true;
			}
		}

		$( "#dialog-form" ).dialog({
			autoOpen: false,
			height: 500,
			width: 350,
			modal: true,
			buttons: {
				"Create an account": function() {
					var bValid = true;
					allFields.removeClass( "ui-state-error" );

					// bValid = bValid && checkLength( name, "username", 3, 16 );
					// bValid = bValid && checkLength( email, "phone", 6, 80 );
					// bValid = bValid && checkLength( password, "password", 5, 16 );

					// bValid = bValid && checkRegexp( name, /^[a-z]([0-9a-z_])+$/i, "Username may consist of a-z, 0-9, underscores, begin with a letter." );
					// From jquery.validate.js (by joern), contributed by Scott Gonzalez: http://projects.scottsplayground.com/email_address_validation/
					// bValid = bValid && checkRegexp( email, /^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/i, "eg. ui@jquery.com" );
					// bValid = bValid && checkRegexp( password, /^([0-9a-zA-Z])+$/, "Password field only allow : a-z 0-9" );

					if ( bValid ) {
						
						var data = "name=" + $("#name").val() + "&" +
               						 "phone=" + $("#phone").val() + "&" +
               						 "password=" + $("#password").val() + "&" +
               						 "designation=" + $("#designation").val() + "&" +
               						 "qualification=" + $ ("#qualification").val();
               						 
						$.post("addStaff.htm",
          	      				data
        				);	
						
						/* $( "#users tbody" ).append( "<tr>" +
							"<td>" + name.val() + "</td>" + 
							"<td>" + email.val() + "</td>" + 
							"<td>" + password.val() + "</td>" +
						"</tr>" );  */
						
						 $( this ).dialog( "close" );
						// $.post("addStaff.htm");
						
						// location.reload(); 
					}
				},
				Cancel: function() {
					$( this ).dialog( "close" );
				}
			},
			close: function() {
				allFields.val( "" ).removeClass( "ui-state-error" );
			}
		});

		$( "#create-user" )
			.button()
			.click(function() {
				$( "#dialog-form" ).dialog( "open" );
			});
		
		$( "#con-dialog-form" ).dialog({
			autoOpen: false,
			height: 500,
			width: 350,
			modal: true,
			buttons: {
				"Create an account": function() {
					var bValid = true;
					allFields.removeClass( "ui-state-error" );

					// bValid = bValid && checkLength( name, "username", 3, 16 );
					// bValid = bValid && checkLength( email, "phone", 6, 80 );
					// bValid = bValid && checkLength( password, "password", 5, 16 );

					// bValid = bValid && checkRegexp( name, /^[a-z]([0-9a-z_])+$/i, "Username may consist of a-z, 0-9, underscores, begin with a letter." );
					// From jquery.validate.js (by joern), contributed by Scott Gonzalez: http://projects.scottsplayground.com/email_address_validation/
					// bValid = bValid && checkRegexp( email, /^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/i, "eg. ui@jquery.com" );
					// bValid = bValid && checkRegexp( password, /^([0-9a-zA-Z])+$/, "Password field only allow : a-z 0-9" );

					if ( bValid ) {
						
						var rdata = "regNo=" + $("#regNo").val() + "&" +
									"name=" + $("#cname").val() + "&" +
               						 "phone=" + $("#cphone").val() + "&" +
               						 "password=" + $("#cpassword").val() + "&" +
               						 "specialization=" + $("#specialization").val() + "&" +
               						 "qualification=" + $ ("#cqualification").val();
               						 
						/*	$.post("addConsultant.htm",
          	      				data:data,
          	      				// function(response){
          	      				//	alert(response);
          	      			    //	}
          	      			    success: function( data ) {
									response( $.map(data,function( item ) {
										
									}));
								} 
        				); */
        				
        				$.ajax({
							    type: "POST",
							    url: "addConsultant.htm",
							    data: rdata,
							    dataType: "json",
							    success: function (data) {
							       $.map(data,function( item ) {
										$( "#con-users tbody" ).append( "<tr>" +
											"<td>" + item.regNo+ "</td>" + 
											"<td>" + item.name + "</td>" + 
											"<td>" + item.phone + "</td>" +
											"<td>" + item.password + "</td>" +
											"<td>" + item.specialization + "</td>" +
											"<td>" + item.qualification + "</td>" +
											"</tr>" );
									});
							    }
							
							});	
						
						/* $( "#con-users tbody" ).append( "<tr>" +
							"<td>" + name.val() + "</td>" + 
							"<td>" + email.val() + "</td>" + 
							"<td>" + password.val() + "</td>" +
						"</tr>" );  */
						
						 $( this ).dialog( "close" );
						// $.post("addStaff.htm");
						
						// location.reload(); 
					}
				},
				Cancel: function() {
					$( this ).dialog( "close" );
				}
			},
			close: function() {
				allFields.val( "" ).removeClass( "ui-state-error" );
			}
		});
		
		$( "#con-create-user" )
			.button()
			.click(function() {
				$( "#con-dialog-form" ).dialog( "open" );
		});
		
		$('#datepicker').change('input', function() {
				 $('#inpayments-tab tbody').empty();
			   	$('#outpayments-tab tbody').empty();
				var dateData=$("#datepicker").val();
				$.ajax({
							    type: "POST",
							    url: "getAllInpayments.htm",
							    data: {sdate: dateData},
							    dataType: "json",
							    success: function (data) {
							       $.map(data,function( item ) {
										$( "#inpayments-tab tbody" ).append( "<tr>" +
											"<td>" + item.patient.patientDetails.patientName+ "</td>" + 
											"<td>" + item.paymentAmt + "</td>" +
											"<td>" + item.paymentTypeEnum + "</td>" +
											"<td>" + item.sdate + "</td>" +
											"</tr>" );
									});
							    }
							
				});	
					
				$.ajax({
							    type: "POST",
							    url: "getAllOutpayments.htm",
							    data: {sdate: dateData},
							    dataType: "json",
							    success: function (data) {
							       $.map(data,function( item ) {
										$( "#outpayments-tab tbody" ).append( "<tr>" +
											"<td>" + item.staffId+ "</td>" + 
											"<td>" + item.name + "</td>" + 
											"<td>" + item.amount + "</td>" +
											"<td>" + item.outPaymentTypeEnum + "</td>" +
											"<td>" + item.sdate + "</td>" +
											"</tr>" );
									});
							    }
							
					});	
				
		} );
		
	});
	</script>	
<div id="maincontainer"><br>
<div class="inner_tube" align="left" style="margin: 1px;"> <!--  <span class="title">Admin DashBoard </span><br />  --> 
<div id="tabs" class="tabs-spacer">
	<ul>
		<li><a href="#tabs-1">Payment Datails</a></li>
		<li><a href="#tabs-2">Today Patients</a></li>
		<li><a href="#tabs-3">Staff</a></li>
		<li><a href="#tabs-4">Consultants</a></li>
	</ul>
	<div id="tabs-1">
		<p>
			<p>Date: <input type="text" id="datepicker"></p>
		</p>
		<table>
		<tr>
		<td valign="top">
		<h1>In payments</h1>
		<div id="inpayments-contain" class="ui-widget">
			<c:choose>
			<c:when test="${!(empty inPaymentsList)}">
				<table id="inpayments-tab" class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>Patinet Name</th>
							<th>Payment Amount</th>
							<th>Payment Type</th>
							<th>Payment Date</th>
						</tr>
					</thead>
					<tbody>
					 <c:forEach items="${inPaymentsList}" var="inPayment">
						<tr>
							<td>${inPayment.patient.patientDetails.patientName}</td>
							<td>${inPayment.paymentAmt}</td>
							<td>${inPayment.paymentTypeEnum}</td>
							<td><fmt:formatDate value="${inPayment.paymetnDate}" pattern="dd/MM/yyyy"/></td>
						</tr>
					</c:forEach>	
					</tbody>
				</table>
			</c:when>
			<c:otherwise>
				<h1>No  In Payments</h1>
			</c:otherwise>
			</c:choose>
			</div>
		</td>
		<td valign="top">
		<h1>Out payments</h1>
		<div id="outpayments-contain" class="ui-widget">
			<c:choose>
			<c:when test="${!(empty outPaymentList)}">
				<table id="outpayments-tab" class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>Issued By</th>
							<th>Recieved By</th>
							<th>Payment Amount</th>
							<th>Payment Mode</th>
							<th>date</th>
						</tr>
					</thead>
					<tbody>
					 <c:forEach items="${outPaymentList}" var="outPayment">
						<tr>
							<td>${outPayment.staffId}</td>
							<td>${outPayment.name}</td>
							<td>${outPayment.amount}</td>
							<td>${outPayment.outPaymentTypeEnum}</td>
							<td><fmt:formatDate value="${outPayment.date}" pattern="dd/MM/yyyy"/></td>
						</tr>
					</c:forEach>	
					</tbody>
				</table>
			</c:when>
			<c:otherwise>
				<h1>No Out Payments</h1>
			</c:otherwise>
			</c:choose>
			</div>
		</td>
		</tr>
		</table>
	</div>
	<div id="tabs-2">
		<p>Date: <input type="text" id="datepicker"></p>
		<table>
		<tr>
		<td valign="top">
		<h1>IP Patients</h1>
		<div id="patients-contain" class="ui-widget">
				<table class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>IP Patients</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${listPatient}" var="patient">
						<c:if test="${patient.patientTypeEnum eq 'IP'}">
							<tr>
								<td>${patient.patientDetails.patientName}</td>
							</tr>
						</c:if>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</td>
		<td valign="top">
		<h1>OP Patients</h1>
		<div id="patients-contain" class="ui-widget">
				<table class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>OP Patients</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listPatient}" var="patient">
							<c:if test="${patient.patientTypeEnum eq 'OP'}">
								<tr>
									<td>${patient.patientDetails.patientName}</td>
								</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</td>
		<td valign="top">
		<h1>Casuality Patients</h1>
		<div id="patients-contain" class="ui-widget">
				<table class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>Casuality Patients</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listPatient}" var="patient">
							<c:if test="${patient.patientTypeEnum eq 'CA'}">
								<tr>
									<td>${patient.patientDetails.patientName}</td>
								</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</td>
		</tr>
		</table>
	</div>
	<div id="tabs-3">
		<div id="dialog-form" title="Create new user">
			<p class="validateTips">All form fields are required.</p>
		
			<form>
			<fieldset>
				<label for="name">Name</label>
				<input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all" />
				<label for="email">Phone</label>
				<input type="text" name="phone" id="phone" value="" class="text ui-widget-content ui-corner-all" />
				<label for="password">Password</label>
				<input type="text" name="password" id="password" value="" class="text ui-widget-content ui-corner-all" />
				<label for="text">Designation</label>
				<input type="designation" name="designation" id="designation" value="" class="text ui-widget-content ui-corner-all" />
				<label for="qualification">Qualification</label>
				<input type="text" name="qualification" id="qualification" value="" class="text ui-widget-content ui-corner-all" />
			</fieldset>
			</form>
		</div>
		<div id="users-contain" class="ui-widget">
			<c:choose>
			<c:when test="${!(empty staffList)}">
				<h1>Existing Users:</h1>
				<table id="users" class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>Name</th>
							<th>Phone</th>
							<th>Password</th>
							<th>Designation</th>
							<th>Qualification</th>
						</tr>
					</thead>
					<tbody>
					 <c:forEach items="${staffList}" var="staff">
						<tr>
							<td>${staff.name}</td>
							<td>${staff.phone}</td>
							<td>${staff.password}</td>
							<td>${staff.designation}</td>
							<td>${staff.qualification}</td>
						</tr>
					</c:forEach>	
					</tbody>
				</table>
			</c:when>
			<c:otherwise>
				<h1>No Staff Existed</h1>
			</c:otherwise>
			</c:choose>
		</div>
				<button id="create-user">Create new user</button>
			</div>
		<div id="tabs-4">
				<div id="con-dialog-form" title="Create new user">
			<p class="validateTips">All form fields are required.</p>
		
			<form>
			<fieldset>
				<label for="name">Reg No</label>
				<input type="text" name="regNo" id="regNo" class="text ui-widget-content ui-corner-all" />
				<label for="name">Name</label>
				<input type="text" name="name" id="cname" class="text ui-widget-content ui-corner-all" />
				<label for="email">Phone</label>
				<input type="text" name="phone" id="cphone" value="" class="text ui-widget-content ui-corner-all" />
				<label for="password">Password</label>
				<input type="password" name="password" id="cpassword" value="" class="text ui-widget-content ui-corner-all" />
				<label for="specialization">Specialization</label>
				<input type="text" name="specialization" id="specialization" value="" class="text ui-widget-content ui-corner-all" />
				<label for="qualification">Qualification</label>
				<input type="text" name="qualification" id="cqualification" value="" class="text ui-widget-content ui-corner-all" />
			</fieldset>
			</form>
		</div>
		<div id="users-contain" class="ui-widget">
			<c:choose>
			<c:when test="${!(empty consultantList )}">
				<h1>Existing Users:</h1>
				<table id="con-users" class="ui-widget ui-widget-content">
					<thead>
						<tr class="ui-widget-header ">
							<th>RegNo</th>
							<th>Name</th>
							<th>Phone</th>
							<th>Password</th>
							<th>Specialization</th>
							<th>Qualification</th>
						</tr>
					</thead>
					<tbody>
					 <c:forEach items="${consultantList}" var="consultant">
						<tr>
							<td>${consultant.regNo}</td>
							<td>${consultant.name}</td>
							<td>${consultant.phone}</td>
							<td>${consultant.password}</td>
							<td>${consultant.specialization}</td>
							<td>${consultant.qualification}</td>
						</tr>
					</c:forEach>	
					</tbody>
				</table>
			</c:when>
			<c:otherwise>
				<h1>No Consultant Existed</h1>
			</c:otherwise>
			</c:choose>
		</div>
				<button id="con-create-user">Create new user</button>
			</div>
		</div>
</div><br><br>
</div>
