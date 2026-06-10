package lk.kaushalya.web.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.kaushalya.core.dto.UserDTO;
import lk.kaushalya.core.service.UserService;

import java.io.IOException;

@WebServlet("/user")
public class UserProfile extends HttpServlet {
    @EJB
    private UserService userService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO userDTO = userService.getUserByID(1L);
        resp.getWriter().write("UserProfile");
    }
}
