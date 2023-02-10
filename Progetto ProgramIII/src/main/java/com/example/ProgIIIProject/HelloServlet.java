package main.java.com.example.ProgIIIProject;

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
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        ServletOutputStream out = response.getOutputStream();
        out.println("<html>");
        out.println("<head><title>Router Web Application</title></head>");
        out.println("<body>");
        out.println("<h1>Router Web Application</h1>");
        out.println("<p>Welcome to the Router Web Application.</p>");
        out.println("<p>You can manage your network routes here.</p>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}
