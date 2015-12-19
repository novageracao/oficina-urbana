package com.nova.geracao.novaescola;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KnowMoreServlet extends HttpServlet{

	private static final long serialVersionUID = 3465766415338782800L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("html/know-more.html");
		dispatcher.forward(req, resp);
	}

}
