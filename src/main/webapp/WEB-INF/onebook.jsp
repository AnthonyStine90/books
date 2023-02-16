<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="webjars/bootswatch/5.2.3/dist/lumen/bootstrap.css"
    />
    <title>Books</title>
  </head>
  <body>

    <div class="container">
      
      <h1>Title ${book.title}</h1>
      <h1>Description: ${book.description}</h1>
      <h1>Language: ${book.language}</h1>
      <h1>Pages: ${book.numberOfPages}</h1>
      
      
    </div>

  </body>
</html>
