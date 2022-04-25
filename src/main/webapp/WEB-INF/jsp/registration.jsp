
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>Registration</title>

<h1>Registration Page</h1>

<form:form modelAttribute="registration">
    Name: <form:input path="name" />
    <tr>
    <input type="submit" value="Register"/>
</form:form>