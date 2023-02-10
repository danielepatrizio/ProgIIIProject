package main.java.com.example.ProgIIIProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;


import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "ciao";
    }
@POST
@Path("/{name}")
@Produces("text/plain")
public String customeWelcome(@PathParam("name")String name){
        return "welcome" + name + "! !!!!!";
}
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ServletOutputStream out = response.getOutputStream();
        out.println("<html>");
        out.println("<head><title>Router Web Application</title></head>");
        out.println("<body>");
        out.println("<h1>Router Web Application</h1>");
        out.println("<p>Welcome to the Router Web Application.</p>");
        out.println("<p>You can manage your network routes here.</p>");
        out.println("<h2>Add a New Route</h2>");
        out.println("<form action='/addRoute' method='post'>");
        out.println("<label for='destination'>Destination:</label>");
        out.println("<input type='text' id='destination' name='destination' required>");
        out.println("<label for='mask'>Mask:</label>");
        out.println("<input type='text' id='mask' name='mask' required>");
        out.println("<label for='gateway'>Gateway:</label>");
        out.println("<input type='text' id='gateway' name='gateway' required>");
        out.println("<input type='submit' value='Add Route'>");
        out.println("</form>");
        out.println("<h2>Current Routes</h2>");
        out.println("<table>");
        out.println("<tr><th>Destination</th><th>Mask</th><th>Gateway</th></tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }

    public void destroy() {
    }
}
