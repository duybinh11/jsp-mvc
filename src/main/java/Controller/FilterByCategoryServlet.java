package Controller;

import Service.IItemService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/filterByCategory")
public class FilterByCategoryServlet extends HttpServlet {

    @Inject
    private IItemService itemService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idCategory = Integer.parseInt(req.getParameter("idCategory"));
        req.setAttribute("items", itemService.findByCategoryId(idCategory));
        req.getRequestDispatcher("/views/filter_by_category.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
