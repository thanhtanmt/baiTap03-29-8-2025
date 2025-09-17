package webstar.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webstar.service.UserService;
import webstar.service.impl.UserServiceImpl;
import webstar.model.Category;


@WebServlet("/categories")
public class CategoryController extends HttpServlet {
    private UserService userservice = new UserServiceImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Lấy user_id từ session
        String userId = (String) req.getSession().getAttribute("user_id");
        List<Category> categories = userservice.readCategory(userId);
        req.setAttribute("categories", categories);
        req.getRequestDispatcher("/categories.jsp").forward(req, resp);
    }
}

