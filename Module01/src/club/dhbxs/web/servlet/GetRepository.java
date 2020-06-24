package club.dhbxs.web.servlet;

import club.dhbxs.bean.Repository;
import club.dhbxs.bean.User;
import club.dhbxs.service.GetRespositoryService;
import club.dhbxs.service.impl.GetRespositoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 17235
 */
@WebServlet(name = "GetRepository", urlPatterns = {"/GetRepository"})
public class GetRepository extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GetRespositoryService getRespositoryService = new GetRespositoryServiceImpl();
        List<Repository> r = new ArrayList<>();
        r = getRespositoryService.getRespoository();
        request.getSession().setAttribute("r", r);
        User user = (User) request.getSession().getAttribute("user");
        if (user.getUserLevel() == null) {
            response.sendRedirect("page/user/home01.jsp");
        } else if (user.getUserLevel().equals("admin")) {
            response.sendRedirect("page/admin/home.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
