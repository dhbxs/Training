package club.dhbxs.web.servlet;

import club.dhbxs.bean.User;
import club.dhbxs.service.UserSignInService;
import club.dhbxs.service.impl.UserSignInServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 17235
 */
@WebServlet(name = "UserSignIn", urlPatterns = {"/UserSignIn"})
public class UserSignIn extends HttpServlet {
    UserSignInService userSignInService = new UserSignInServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("inputUserName");
        String userPassword = request.getParameter("inputPassword");
        String userPosition = request.getParameter("inputPosition");
        String userEmail = request.getParameter("inputEmail");

        if (userName != null && userPassword != null) {
            User user = new User();
            user.setUserName(userName);
            user.setUserPassword(userPassword);
            user.setUserPosition(userPosition);
            user.setUserEmail(userEmail);
            if (userSignInService.add(user)) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("usersignin.jsp");
            }
        } else {
            response.sendRedirect("usersignin.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
