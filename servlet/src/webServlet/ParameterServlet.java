package webServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// GET요청: http://localhost:port/param?name=abc&age=123
@WebServlet("/param")
public class ParameterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter(); //client와 연결통로를 열어주는것
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        out.println("<body>");

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        out.println("name : " + name + "<br>");
        out.println("age : " +age + "<br>");

        out.println("</body>");
        out.println("</html>");
    }

}
