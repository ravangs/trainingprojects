package com.visa.training.web;

import com.visa.training.jdbc.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addproduct")
public class AddProduct extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_name = request.getParameter("product_name");
		float product_price = Float.parseFloat(request.getParameter("product_price"));
		int product_qoh = Integer.parseInt(request.getParameter("product_qoh"));
		
		ProductDAO dao = new ProductDAO();
		Product toBeSaved = new Product(product_name, product_price, product_qoh);
		int generatedId = dao.save(toBeSaved);
		PrintWriter out = response.getWriter();
		out.println("Created product with id: "+generatedId);

	}

}
