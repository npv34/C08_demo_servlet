package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // set content type response
        resp.setContentType("text/html; charset=UTF-8");

        // ghi du lieu vao response
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<form method='POST' action='/login'>");
        out.println("Email: <input type='email' name='email'/>");
        out.println("Password: <input type='password' name='password'/>");
        out.println("<button type='submit'>Login</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (Objects.equals(email, "admin@gmail.com") && Objects.equals(password, "1234")) {
            resp.sendRedirect("/home");
        } else {
            resp.sendRedirect("/login");
        }

    }
}
