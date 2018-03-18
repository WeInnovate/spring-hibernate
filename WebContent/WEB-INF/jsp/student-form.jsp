<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 


<form:form action="processStudentForm" modelAttribute="student">
<form:input path="firstName" />
<span style="color:red"><form:errors path="firstName" /></span>
<form:input path="lastName" />
<span style="color:red"><form:errors path="lastName" /></span>

Age: <form:input path="age" />
<span style="color:red"><form:errors path="age" /></span>

DOB: <form:input path="dob" />
<span style="color:red"><form:errors path="dob" /></span>

Email: <form:input path="email" />
<span style="color:red"><form:errors path="email" /></span>

Batch ID: <form:input path="batchId" />
<span style="color:red"><form:errors path="batchId" /></span>

Male: <form:radiobutton path="gender" value="Male" />
Female: <form:radiobutton path="gender" value="Female" />
<span style="color:red"><form:errors path="gender" /></span>
<input type="submit" value="Register" />
</form:form>