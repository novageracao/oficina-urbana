package br.edu.ifpi.novaescola;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutUsServlet extends HttpServlet {

	private static final long serialVersionUID = -5885891667878719536L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("html/about-us.html");
		dispatcher.forward(req, resp);
	}

}
