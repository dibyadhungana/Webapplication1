import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Helloworld extends HttpServlet{
	public void doGet (HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter ();
		out.print ("helloWorld");
        String un = request.getParameter("username");
        String ps = request.getParameter("password");
        out.println("username "+un);
        out.println("passsword "+ps);
        
        }
}  

