package club.dhbxs.web.servlet;

import club.dhbxs.bean.Repository;
import club.dhbxs.service.DeleteFromRepositoryService;
import club.dhbxs.service.GetRespositoryService;
import club.dhbxs.service.impl.DeleteFromRepositoryServiceImpl;
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
@WebServlet(name = "DeleteFromRepository", urlPatterns = {"/DeleteFromRepository"})
public class DeleteFromRepository extends HttpServlet {
    DeleteFromRepositoryService deleteFromRepositoryService = new DeleteFromRepositoryServiceImpl();
    GetRespositoryService getRespositoryService = new GetRespositoryServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //从数据库中删除商品信息
        String id = request.getParameter("productId");
        Boolean flag = deleteFromRepositoryService.delete(id);
        if (flag == false) {
            response.sendRedirect("page/admin/home.jsp?flag=0");
            return;
        }
        //放入session中以便home页读取
        List<Repository> repositories = new ArrayList<>();
        repositories = getRespositoryService.getRespoository();
        request.getSession().setAttribute("r", repositories);

        response.sendRedirect("page/admin/home.jsp");
        return;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
