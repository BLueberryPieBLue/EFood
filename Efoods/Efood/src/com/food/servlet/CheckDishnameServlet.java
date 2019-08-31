package com.food.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.beans.Dish;
import com.food.beans.DishDaoImpl;
import com.food.dao.DishDao;


public class CheckDishnameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String dishname = request.getParameter("dishname");
		DishDao dishDao = new DishDaoImpl();

		Dish dish = dishDao.getDishByDishname(dishname);
		String msg = "";
		if (dishname == "") {
			msg = "2";
		} else if (dish == null) {
			msg = "1";
		} else {
			msg = "0";
		}
		response.setContentType("text/html;charset=utf-8");

		response.getWriter().println(msg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		doGet(request, response);
	}

}
