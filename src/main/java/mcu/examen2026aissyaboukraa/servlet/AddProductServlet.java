package mcu.examen2026aissyaboukraa.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mcu.examen2026aissyaboukraa.dao.ProductDAO;
import mcu.examen2026aissyaboukraa.model.Product;
import java.io.IOException;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("productName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String category = request.getParameter("category");
        int price = Integer.parseInt(request.getParameter("price"));

        Product product = new Product();
        product.setProductName(productName);
        product.setQuantity(quantity);
        product.setCategory(category);
        product.setPrice(price);

        productDAO.addProduct(product);

        response.sendRedirect("products");
    }
}

