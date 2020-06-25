package club.dhbxs.web.servlet;

import club.dhbxs.bean.User;
import club.dhbxs.service.UserSignInService;
import club.dhbxs.service.UserSignUpService;
import club.dhbxs.service.impl.UserSignInServiceImpl;
import club.dhbxs.service.impl.UserSignUpServiceImpl;

import javax.lang.model.element.VariableElement;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author 17235
 */
@WebServlet(name = "UserSignUp", urlPatterns = {"/UserSignUp"})
public class UserSignUp extends HttpServlet {
    UserSignUpService userSignUpService = new UserSignUpServiceImpl();

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
            if (userSignUpService.add(user)) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("usersignup.jsp");
            }
        } else {
            response.sendRedirect("usersignup.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
