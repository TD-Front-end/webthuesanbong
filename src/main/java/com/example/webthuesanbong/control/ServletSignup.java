package com.example.webthuesanbong.control;

import com.example.webthuesanbong.dao.UsersDAO;
import com.example.webthuesanbong.model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/signup"})
public class ServletSignup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int machusan = Integer.parseInt(request.getParameter("machusan"));
        String tenchusan = request.getParameter("tenchusan");
        String sdt = request.getParameter("sdt");
        String diachi = request.getParameter("diachi");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String re_password = request.getParameter("re_password");
        String email = request.getParameter("email");
//
        if(!password.equals(re_password)){
            response.sendRedirect("Login.jsp");
        }else {
            UsersDAO usersDAO =new UsersDAO();
            Users users = usersDAO.checkAccountExits(username);
            if(users == null){
//                dc signup
                usersDAO.Signup(machusan, tenchusan, sdt, diachi,username, password, email);
                response.sendRedirect("index.jsp");

            }else {
                response.sendRedirect("Login.jsp");
            }

        }



    }
}
