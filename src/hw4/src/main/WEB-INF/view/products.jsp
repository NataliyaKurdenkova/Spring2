<!DOCTYPE html>
<html>
<head>
    <%--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />--%>
</head>
<body>
<h1>All product: </h1>

<table border="1px">
    <tr>
        <td>Id</td>
        <td>title</td>
        <td>cost</td>
    </tr>
    <#list productList as product>
    <tr>
        <td>${product.id}</td>
        <td>${product.title}</td>
        <td>${product.cost}</td>

    </tr>
</#list>
</table>
</body>
</html>