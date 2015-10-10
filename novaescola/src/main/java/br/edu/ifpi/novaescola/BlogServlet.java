package br.edu.ifpi.novaescola;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlogServlet extends HttpServlet {

	private static final long serialVersionUID = 8136308267348580026L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String post = req.getParameter("p");
		if("001".equals(post)){
			RequestDispatcher dispatcher = req.getRequestDispatcher("html/blog/tips-street-musician.html");
			dispatcher.forward(req, resp);
		} else{
			RequestDispatcher dispatcher = req.getRequestDispatcher("html/blog.html");
			dispatcher.forward(req, resp);
		}
	}

}
