<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/packagebooking/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="text-center mt-4"><h4>Payment Reports</h4></div>
<table id="payTable" class="table table-striped table-bordered" style="width:100%; text-align: center">
         <thead>
            <tr>
            	<th>Package Payment Code</th>
            	<th>Package Code</th>
                <th>Card Type</th>
                <th>Bank Name</th>
                <th>Payment Status</th>
                <th>Invoice</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${p}" var="c">
                <tr>
                	<td>${c.packagePaymentCode}</td>
                	<td>${c.packageCode}</td>
                    <td>${c.cartType}</td>
                    <td>${c.bankName}</td>
                    <td style="font-weight: bold; color: green">${c.paymentStatus}</td>
                    <td class="text-center">                                          
                        <a class="btn btn-success" role="button"  href="/packagepayment/edit/${c.packagePaymentCode}"><i class="fa fa-book" aria-hidden="true"></i></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />
<script>
    $('#payTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });
</script>