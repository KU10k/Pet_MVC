<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<p>Pets: ${pet.pets}</p>
<p>PetName: ${pet.petName}</p>
<p>Age: ${pet.age}</p>
<p>Sex of the Animal: ${pet.sexOfTheAnimal}</p>
<p>Email Of The Owner:${pet.emailOfTheOwner}</p>
<p>Phone Number Of The Owner:${pet.phoneNumberOfTheOwner}</p>
<p>City: ${pet.city}</p
<p>Award(medals):</p>
<ul>
    <c:forEach var="awards" items="${pet.award}">
        <li>${awards}</li>
    </c:forEach>
</ul>
</body>
</html>
