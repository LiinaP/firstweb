package lv.ctco.javaschool.firstweb;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lina.pugo on 3/8/2017.
 */
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userSurname = request.getParameter("userSurname");
        String email = request.getParameter("email");
        User user = new User(userName, userSurname, email);
        request.setAttribute("user", user);
        //request.getSession().setAttribute("user", user);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
        //response.sendRedirect("/hello.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Hello World!");
    }

}
