package com.visa.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/carservlet")
public class CarServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] carString = request.getParameterValues("cars");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("carSelected", carString);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/bikes.html");
		dispatcher.forward(request,response);
		
	}

}
