package com.food.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.beans.Dish;
import com.food.beans.DishDaoImpl;
import com.food.dao.DishDao;


public class ShowDishList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		DishDao dishdao =new DishDaoImpl();
		List<Dish> dishes=dishdao.SelectAllDish();
		req.setAttribute("dishes", dishes);
		req.getRequestDispatcher("dish.jsp").forward(req, resp);
	}
}
