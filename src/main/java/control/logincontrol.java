package control;

import dao.UsersDAO;
import model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.validation.constraints.Email;
import java.io.IOException;

@WebServlet(name = "logincontrol", urlPatterns = {"/control/logincontrol"})
public class logincontrol extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/webapp/Login.jsp");
//        dispatcher.forward(request, response);
    }
//
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
//
        UsersDAO usersDAO = new UsersDAO();
        Users users = usersDAO.Login(email, password);
        if(users == null){
//            request.setAttribute("mess","Sai tài khoản hoặc mật khẩu");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}
