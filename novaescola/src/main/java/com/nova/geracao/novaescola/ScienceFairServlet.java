package com.nova.geracao.novaescola;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScienceFairServlet extends HttpServlet {

	private static final long serialVersionUID = -8807275684268571202L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("html/science-fair.html");
		dispatcher.forward(req, resp);
	}

}
