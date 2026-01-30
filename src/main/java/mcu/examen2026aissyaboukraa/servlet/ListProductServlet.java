package mcu.examen2026aissyaboukraa.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import mcu.examen2026aissyaboukraa.dao.ProductDAO;
import mcu.examen2026aissyaboukraa.model.Product;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/products")
public class ListProductServlet extends HttpServlet {
    private ProductDAO productDAO;

    @Override
    public void init() throws ServletException {
        productDAO = (ProductDAO) getServletContext().getAttribute("productDAO");
        if (productDAO == null) {
            productDAO = new ProductDAO();
            getServletContext().setAttribute("productDAO", productDAO);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Product> products = productDAO.getAllProducts();

        HttpSession session = request.getSession();
        session.setAttribute("totalProducts", products.size());

        request.setAttribute("products", products);
        request.getRequestDispatcher("list-product.jsp").forward(request, response);
    }
}

