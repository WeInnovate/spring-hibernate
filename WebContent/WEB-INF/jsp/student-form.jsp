<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 


<form:form action="processStudentForm" modelAttribute="student">
<form:input path="firstName" />
<span style="color:red"><form:errors path="firstName" /></span>
<form:input path="lastName" />
Male: <form:radiobutton path="gender" value="Male" />
Female: <form:radiobutton path="gender" value="Female" />
<input type="submit" value="Register" />
</form:form>