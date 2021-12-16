package Bai1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/TamGiacServlet/tamgiac","/TamGiacServlet/chuvi", "/TamGiacServlet/dientich"})
public class TamGiacServlet extends HttpServlet{ 
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/view/lab2/bai1/tamgiac.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String aString = req.getParameter("a");
		String bString = req.getParameter("b");
		String cString = req.getParameter("c");
		String uriString = req.getRequestURI();
		double a = Double.parseDouble(aString);	
		double b = Double.parseDouble(bString);
		double c = Double.parseDouble(cString);
		if ((a+b)<c || (a+c)<b || (b+c)<a) {
			req.setAttribute("message", "Cạnh của tam giác không hợp lệ!");
		} else {
			if (uriString.contains("dientich")) {
				req.setAttribute("message", "Diện tích của tam giác là: " + dientich(a, b, c));
			} 
			if (uriString.contains("chuvi")) {
				req.setAttribute("message", "Chu vi của tam giác là: " + chuVi(a, b, c));
			}
		}
		req.getRequestDispatcher("/view/lab2/bai1/tamgiac.jsp").forward(req, resp);
	}
	
	public double chuVi(double a, double b, double c) {
		return a+b+c;
	}
	
	public double dientich(double a, double b, double c) {
		double nuaP = chuVi(a, b, c)/2;
		return Math.sqrt(nuaP*nuaP*(nuaP-a)*nuaP*(nuaP-b)*nuaP*(nuaP-c));
	}

}
