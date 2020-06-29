package club.dhbxs.web.servlet;

import club.dhbxs.bean.Repository;
import club.dhbxs.service.AddIntoRepositoryService;
import club.dhbxs.service.GetRespositoryService;
import club.dhbxs.service.impl.AddIntoRepositoryServiceImpl;
import club.dhbxs.service.impl.GetRespositoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author 17235
 */
@WebServlet(name = "AddIntoRepository", urlPatterns = {"/AddIntoRepository"})
public class AddIntoRepository extends HttpServlet {
    GetRespositoryService getRespositoryService = new GetRespositoryServiceImpl();
    AddIntoRepositoryService addIntoRepositoryService = new AddIntoRepositoryServiceImpl();

    /**
     * 添加商品信息到数据库中
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void addInto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reName = request.getParameter("reName");
        String rePrice0 = request.getParameter("rePrice");
        String reNum0 = request.getParameter("reNum");
        String describe = request.getParameter("describe");
        String imgUrl = request.getParameter("imgUrl");
        BigDecimal rePrice1 = new BigDecimal(rePrice0);
        Integer reNum1 = Integer.parseInt(reNum0);
        Repository repository = new Repository(null, reName, reNum1, rePrice1, null, describe, imgUrl);
        addIntoRepositoryService.addRepository(repository);

        //放入session中以便home页读取
        List<Repository> repositories = getRespositoryService.getRespoository();
        request.getSession().setAttribute("r", repositories);

        response.sendRedirect("page/admin/home.jsp");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            //获取业务鉴别字符串，获取相应业务的方法，方法反射对象
            Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
