<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Hello</h1>


<form:form action="/show/pet" method="get" modelAttribute="pet">
    Pets: <form:input path="pets"/>
    <form:errors path="pets"/>
    <br><br>
    PetName: <form:input path="petName"/>
    <form:errors path="petName"/>
    <br><br>
    Age: <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
    Sex of the Animal:
    <form:radiobutton path="sexOfTheAnimal" value="Male gender" label="M"/>
    <form:radiobutton path="sexOfTheAnimal" value="Female gender" label="W"/>
    <form:errors path="sexOfTheAnimal"/>
    <br><br>
    Email Of The Owner:<form:input path="emailOfTheOwner"/>
    <form:errors path="emailOfTheOwner"/>
    <br><br>
    Phone Number Of The Owner:<form:input path="phoneNumberOfTheOwner"/>
    <form:errors path="phoneNumberOfTheOwner"/>
    <br><br>
    <form:select path="city">
        <form:options items="${pet.cities}"/>
        <form:option value="Moskow" label="MSK"/>
        <form:option value="SPB" label="SPB"/>
    </form:select>
    <br><br>
    Award(medals):
    <form:checkbox path="award" value="Russian" label="Russian"/>
    <form:checkbox path="award" value="France" label="France"/>
    <form:checkbox path="award" value="Worldwide" label="Worldwide"/>
    <br><br>

    <button type="submit">Submit</button>

</form:form>
<p>From MainController</p>
</body>
</html>
