package com.food.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.beans.Dish;
import com.food.beans.DishDaoImpl;
import com.food.dao.DishDao;


public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		if(id==null) {
			String url ="/Efood/main";
			response.sendRedirect(url);
			return;
		}
		DishDao dishDao = new DishDaoImpl();
		Dish dish = dishDao.getDishById(id);
		HttpSession session=request.getSession();
		List<Dish> cart=(List) session.getAttribute("cart");
		if(cart==null) {
			cart=new ArrayList<Dish>();
			session.setAttribute("cart", cart);
		}
		cart.add(dish);
		Cookie cookie=new Cookie("JSESSIONID",session.getId());
		cookie.setMaxAge(60*30);
		cookie.setPath("/Efood");
		response.addCookie(cookie);
		String url="/Efood/main";
		response.sendRedirect(url);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
