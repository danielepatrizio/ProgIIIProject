<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
          <h1><%= "Hello World!" %>
                                    </h1>
<br/>
          <form action="/name" method="post">
              <p>
                  Input Name <input type="string" name="name" required/>
              </p>
              <p>
                   <input type="submit" value="RUN"/>
              </p>
          </form>
<a href="hello-servlet">Hello Servlet</a>


</body>
</html>