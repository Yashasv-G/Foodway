package com.example.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final HashMap<String, String> users = new HashMap<>();

    static {
        users.put("testuser", "password"); // Pre-defined user for testing
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (users.containsKey(username) && users.get(username).equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.getWriter().println("Login successful!");
        } else {
            response.getWriter().println("Invalid username or password!");
        }
    }
}
