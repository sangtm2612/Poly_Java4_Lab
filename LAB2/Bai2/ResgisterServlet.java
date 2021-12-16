package Bai2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class ResgisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/view/lab2/bai2/form.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nameString = req.getParameter("name");
		String pasString = req.getParameter("pass");
		String genderString = req.getParameter("gender").equals("1") ? "Nam" : "Nữ";
		String simpleString = req.getParameter("simple").equals("1") ? "Đã có gia đình" : "Độc thân";
		String countryString = req.getParameter("country");
		String noteString = req.getParameter("note");
		req.setAttribute("name", nameString);
		req.setAttribute("pass", pasString);
		req.setAttribute("gender", genderString);
		req.setAttribute("simple", simpleString);
		req.setAttribute("country", countryString);
		req.setAttribute("note", noteString);
		req.getRequestDispatcher("/view/lab2/bai2/result.jsp").forward(req, resp);
	}
}
