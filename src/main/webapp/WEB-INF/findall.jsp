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
    <title>All the Books</title>
  </head>
  <body>

    <div class="container d-flex justify-content-center flex-column">
      <div class="container text-center">
        <h1>All the books</h1>
      </div>
      <div class="container">
        <table class="table table-hover">
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">Title</th>
              <th scope="col">Description</th>
              <th scope="col">Language</th>
              <th scope="col"># of pages</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="book" items="${books}">
              <tr class="table-info">
                <td>${book.id}</td>
                <td><a href="/books/${book.id}">${book.title}</a></td>
                <td>${book.language}</td>
                <td>${book.description}</td>
                <td>${book.numberOfPages}</td>
                <td>Edit</td>
                <td>Delete</td>
              </tr>
            </c:forEach>
          </tbody>
      </div>
    </div>

  </body>
</html>
