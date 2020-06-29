package club.dhbxs.web.servlet;

import club.dhbxs.bean.Repository;
import club.dhbxs.bean.User;
import club.dhbxs.service.CartService;
import club.dhbxs.service.OrdeService;
import club.dhbxs.service.impl.CartServiceImpl;
import club.dhbxs.service.impl.OrdeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Cart", urlPatterns = {"/Cart"})
public class Cart extends HttpServlet {
    CartService cartService = new CartServiceImpl();
    OrdeService ordeService = new OrdeServiceImpl();

    protected void addCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] cart = request.getParameterValues("cart");
        if (cart == null) {
            response.sendRedirect("page/user/home01.jsp");
        }
        List<Repository> repositories = new ArrayList<>();
        repositories = cartService.getCart(cart);
        if (cart != null) {
            request.getSession().setAttribute("cartList", repositories);
            response.sendRedirect("page/user/cartList.jsp");
        }

    }

    protected void buyCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String[] address = request.getParameterValues("address");
        User user = (User) session.getAttribute("user");
        List<Repository> repositoryList = (List<Repository>) request.getSession().getAttribute("cartList");
        if (address[0] != null) {
            ordeService.buy(repositoryList, address, user);
            response.sendRedirect("page/user/order.jsp");
        } else {
            response.sendRedirect("page/user/cartLisst.jap");
        }
    }

    /**
     * 获取业务代码
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
