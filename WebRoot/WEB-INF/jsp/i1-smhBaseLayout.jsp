<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
		
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<link rel="stylesheet" type="text/css" href="../css/default.css" media="screen"/>
<link rel="stylesheet" href="../css/themes/base/jquery.ui.all.css">
<link rel="stylesheet" href="../css/themes/base/jquery-ui.css"> 
 
    
	<script src="../js/jquery-1.8.2.js"></script>
	<script src="../js/external/jquery.bgiframe-2.1.2.js"></script>
	<script src="../js/ui/jquery.ui.core.js"></script>
	<script src="../js/ui/jquery.ui.widget.js"></script>
	<script src="../js/ui/jquery.ui.mouse.js"></script>
	<script src="../js/ui/jquery.ui.button.js"></script>
	<script src="../js/ui/jquery.ui.draggable.js"></script>
	<script src="../js/ui/jquery.ui.resizable.js"></script>
	<script src="../js/ui/jquery.ui.dialog.js"></script>
	<script src="../js/ui/jquery.ui.effect.js"></script>
	<script src="../js/ui/jquery.ui.tabs.js"></script>
	<script src="../js/ui/jquery.ui.position.js"></script>
	<script src="../js/ui/jquery.ui.menu.js"></script>
	<script src="../js/ui/jquery.ui.autocomplete.js"></script>
	<script src="../js/ui/jquery.ui.accordion.js"></script>
	<script src="../js/ui/jquery.ui.mouse.js"></script>
	<script src="../js/ui/jquery.ui.sortable.js"></script>
	<script src="../js/ui/jquery.ui.datepicker.js"></script>
	  
	<link rel="stylesheet" href="../css/demos.css">
	
	<style>
	.column { width: 180px; float: left; padding-bottom: 100px; overflow: auto; }
	.portlet { margin: 0 1em 1em 0; }
	.portlet-header { margin: 0.3em; padding-bottom: 4px; padding-left: 0.2em; }
	.portlet-header .ui-icon { float: left; }
	.portlet-content { padding: 0.4em; }
	.ui-sortable-placeholder { border: 1px dotted black; visibility: visible !important; height: 50px !important; }
	.ui-sortable-placeholder * { visibility: hidden; }
	</style>
	<style>
	.ui-autocomplete {
		max-height: 100px;
		overflow-y: auto;
		/* prevent horizontal scrollbar */
		overflow-x: hidden; 
	}
	/* IE 6 doesn't support max-height
	 * we use height instead, but this forces the menu to always be this tall
	 */
	* html .ui-autocomplete {
		height: 100px;
	}
	.ui-menu { width: 150px; }
	</style>

	<script>
	
		$(function() {
		$( "#tabs" ).tabs({
		});
		
	});
	
	$(function() {
		$( "#accordion" ).accordion();
	});
		$(function() {
		$( ".column" ).sortable({
			connectWith: ".column"
		});

	$( ".portlet" ).addClass( "ui-widget ui-widget-content ui-helper-clearfix ui-corner-all" )
			.find( ".portlet-header" )
				.addClass( "ui-widget-header ui-corner-all" )
				.prepend( "<span class='ui-icon ui-icon-minusthick'></span>")
				.end()
			.find( ".portlet-content" );

		$( ".portlet-header .ui-icon" ).click(function() {
			$( this ).toggleClass( "ui-icon-minusthick" ).toggleClass( "ui-icon-plusthick" );
			$( this ).parents( ".portlet:first" ).find( ".portlet-content" ).toggle();
		});

		$( ".column" ).disableSelection();
	});
	
	$(function() {
		$( "#menu" ).menu();
	});
	</script>
	
	<script type="text/javascript">
		if(typeof jQuery=="undefined"){
			var jQPath="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/"; 
			document.write("<script src='",jQPath,"jquery.min.js' type='text/javascript'><\/script>");
		}
		</script>
		<script type="text/javascript">
		(function(){
			jQuery.fn.print = function(options){
				var o = $.extend({css:"",},options);
				var html = 	"<HTML>\n<HEAD>"+
							$("head").html()+"\n</HEAD>\n<BODY>\n";
				this.each(function(i,e){
					html += "<div id='top_section'> \n " +
					+ " <div class='line'> \n </div> \n " +
					+ "<DIV style='font-family:verdana,arial,helvetica,"+
							"sans-serif;font-size:8pt;margin:20px;'>\n"+
							$(e).html()+"</DIV>\n";
				});
					html += "</BODY>\n</HTML>";
				var printWP = window.open("","printWebPart");
				printWP.document.open();
				printWP.document.write(html);
				printWP.document.close();
				printWP.print();
				return this;
			};
		})();
		</script>
	
	<script src="../js/contacts.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title> 
<tab:tabConfig />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath",basePath);
%> 
</head>
<body>
<div>
<table border="1" cellpadding="0" cellspacing="0" align="center">
    <tr>
        <td height="30" colspan="2">
        	<tiles:insertAttribute name="header" />
        </td>
    </tr>
    <tr>
        
        <td width="450" >
        	<tiles:insertAttribute name="body" />
        </td>
    </tr>
    <tr>
        <td height="30" colspan="2"><tiles:insertAttribute name="footer" /> </td>
    </tr>
</table>
</body>

</html>

