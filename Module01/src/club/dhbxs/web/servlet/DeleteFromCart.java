package club.dhbxs.web.servlet;

import club.dhbxs.bean.Repository;
import club.dhbxs.service.CartService;
import club.dhbxs.service.impl.CartServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DeleteFromCart", urlPatterns = {"/DeleteFromCart"})
public class DeleteFromCart extends HttpServlet {
    CartService cartService = new CartServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("productId");
        List<Repository> repositories = (List<Repository>) request.getSession().getAttribute("cartList");
        repositories = cartService.deleteFromList(repositories, s);
//        System.out.println(repositories.size());
        request.getSession().setAttribute("cartList", repositories);
        if (!repositories.isEmpty()) {
            response.sendRedirect("page/user/cartList.jsp");
        } else {
            response.sendRedirect("page/user/home01.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
