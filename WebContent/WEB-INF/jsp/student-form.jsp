<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 


<form:form action="processStudentForm" modelAttribute="student">
<form:input path="firstName" />
<form:input path="lastName" />
<input type="submit" value="Register" />
</form:form>