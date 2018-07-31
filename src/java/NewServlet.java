import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response )
	  throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter ();
		String fn = request.getParameter("firstname");
		String ln = request.getParameter("lastname");
		String po = request.getParameter("phoneno");

		out.println(fn);
		out.println(ln);
		out.println(po);
	}
}
