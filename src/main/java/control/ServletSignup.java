package control;

import dao.UsersDAO;
import model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletSignup", value = "/sign")
public class ServletSignup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String re_password = request.getParameter("re_password");
//
        if(!password.equals(re_password)){
            response.sendRedirect("Login.jsp");
        }else {
            UsersDAO usersDAO =new UsersDAO();
            Users users = usersDAO.checkAccountExits(username);
            if(users == null){
//                dc signup
                usersDAO.Signup(username, password);
                response.sendRedirect("index.jsp");

            }else {
                response.sendRedirect("Login.jsp");
            }

        }



    }
}
