<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>trang home</h1>
  <c:forEach var="item" items="${listItem}">
    <h1>${item}</h1>
  </c:forEach>

  <c:forEach var="category" items="${categorys}">
      <a href="filterByCategory?idCategory=${category.id}">${category.name}</a>
  </c:forEach>

</body>
</html>
