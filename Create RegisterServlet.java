package com.example.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final HashMap<String, String> users = new HashMap<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null && !users.containsKey(username)) {
            users.put(username, password);
            response.getWriter().println("Registration successful!");
        } else if (users.containsKey(username)) {
            response.getWriter().println("Username already exists!");
        } else {
            response.getWriter().println("Please enter a valid username and password!");
        }
    }
}
