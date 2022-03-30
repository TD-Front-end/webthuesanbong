package com.example.webthuesanbong.control;

import com.example.webthuesanbong.dao.UsersDAO;
import com.example.webthuesanbong.model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class logincontrol extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
//
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//
        UsersDAO usersDAO = new UsersDAO();
        Users users = usersDAO.Login(username, password);
        if(users == null){
            request.setAttribute("mess","Sai tài khoản hoặc mật khẩu");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}
