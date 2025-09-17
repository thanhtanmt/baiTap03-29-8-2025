package webstar.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webstar.service.UserService;
import webstar.service.impl.UserServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/forgotpassword")
public class ForgotPasswordController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Hiển thị form quên mật khẩu
        req.getRequestDispatcher("/views/forgotpassword.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        String email = req.getParameter("email");
        String alertMsg = ""; 

        if (email == null || email.isEmpty()) {
            alertMsg = "Email không được để trống";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/forgotpassword.jsp").forward(req, resp);
            return;
        }

        // TODO: Thực hiện kiểm tra email có tồn tại trong DB không
        UserService service = new UserServiceImpl();
       
        boolean isExist = service.checkExistEmail(email);

        if (isExist) {
         
            alertMsg = "Mật khẩu của bạn đã được đổi thành '123456'";
            service.resetPassword(email, "123456");
            
        } else {
            alertMsg = email + " Email không tồn tại trong hệ thống hehehe.";
        }

        req.setAttribute("alert", alertMsg);
        req.getRequestDispatcher("/views/forgotpassword.jsp").forward(req, resp);
    }
}
