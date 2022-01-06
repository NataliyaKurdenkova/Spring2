<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="insert" modelAttribute="product">
    id:  <form:input path="id" />
    <br>
    Title: <form:input path="title" />
    <br>
    Cost: <form:input path="cost" />
     <br>
     <input type="submit" value="Insert" />
</form:form>
</body>
</html>