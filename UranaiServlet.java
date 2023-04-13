package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UranaiServlet")
public class UranaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] luckArray = {"超すっきり","すっきり","もやっと"};
		int index = (int)(Math.random() * 3);
		String luck = luckArray[index];
		
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("MM月dd日");
		String today = f.format(date);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\" />");
		out.println("<title>すっきり占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + today + "の運勢は" + luck + "です</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
