$(document).ready(function() {
 
  /*  $( "#patientName" ).autocomplete({
        source: './getPatientNameList.htm'
    });
  */  
     $( "#patientName" ).autocomplete({
      //  source: './getPatientNameList.htm'
		    source: function( request, response ) {
						$.ajax({
							url: "getPatientNameList.htm",
						  dataType: "json",
						  data: {
							  term: request.term
							},
						   success: function( data ) {
								response( $.map(data,function( item ) {
									return {
										label: item.name+","+item.id,
										value: item.name
									}
								})); 
							} 
						});
					}
		});
     
		
		   
  /*  $( "#technologies").autocomplete({
        source: function (request, response) {
            $.getJSON("${pageContext. request. contextPath}/get_tech_list.html", {
                term: extractLast(request.term)
            }, response);
        },
        search: function () {
            // custom minLength
            var term = extractLast(this.value);
            if (term.length < 1) {
                return false;
            }
        },
        focus: function () {
            // prevent value inserted on focus
            return false;
        },
        select: function (event, ui) {
            var terms = split(this.value);
            // remove the current input
            terms.pop();
            // add the selected item
            terms.push(ui.item.value);
            // add placeholder to get the comma-and-space at the end
            terms.push("");
            this.value = terms.join(", ");
            return false;
        }
    }); */
   
   $("#discount").keyup(function(){
   		var total=0;
		total=parseInt($("#totalAmount").val(),10)-parseInt($("#discount").val(),10);
		$("#paymentAmt").val(total);
		$("#balance").text(total);	
	}); 
	
	$("#paymentAmt").change(function(){
   		var due=0;
   		var total=0;
		total=parseInt($("#totalAmount").val(),10)-parseInt($("#discount").val(),10);
		due=total-parseInt($("#paymentAmt").val(),10);
		$("#due").val(due);	
	}); 
	
	$("#button").click(function()
           {
             $("#tabs-2").print();
           }
      );
      
    $("a.aButton").button();
    
    $( "#datepicker" ).datepicker({
			showOn: "button",
			buttonImage: "../images/calendar.gif",
			buttonImageOnly: true
	}); 
	
	$( "input[type=submit]" )
      .button()
         
});