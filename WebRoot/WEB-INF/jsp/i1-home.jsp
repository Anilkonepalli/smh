<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="taglib.jsp" %>
 <script type="text/javascript">
    $(document).ready(function(){
        $("body").keydown(function(key) {
            if (key.which == 113) { // F2 key
                window.location.href = "Wards.html"
            }
        });
    });
</script>
<div id="maincontainer">
<br>
<sec:authorize access="hasRole('admin')">
<a href="${basePath}lab/labDashboard.htm" class="aButton">Lab</a> &nbsp;&nbsp;&nbsp;
</sec:authorize>
<a href="${basePath}payment/ceateVoucher.htm" class="aButton">Create a Vocher</a> &nbsp;&nbsp;&nbsp;
<sec:authorize access="hasRole('admin')">
<a href="${basePath}admin/adminDashboard.htm" class="aButton">Admin</a>
</sec:authorize> 
<div class="inner_tube" align="center" style="margin: 15px;"><span class="inner_tube" style="margin: 15px;"><img src="../images/home.jpg" width="918" height="474" /></span><br />
    <br />
</div>
</div>