package com.food.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.beans.Dish;
import com.food.beans.DishDaoImpl;
import com.food.beans.User;
import com.food.dao.DishDao;


public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute("loginUser");
		if(user==null) {
			response.getWriter().println("您还没有登录,请<a href='/Efood/login.jsp'>登录<a/>");
		}else {
			Cookie cookie = new Cookie("JSESSIONID",session.getId());
			cookie.setMaxAge(60*30);
			cookie.setPath("/Efood");
			response.addCookie(cookie);
			List<Dish> cart=null;
			boolean purFlag=true;
			HttpSession session1 =request.getSession(false);
			if(session1==null) {
				purFlag=false;
			}else {
				cart=(List) session1.getAttribute("cart");
				if(cart==null) {
					purFlag=false;
				}
			}
			if (purFlag) {
				request.setAttribute("cart",cart);
			}
			request.getRequestDispatcher("third.jsp").forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
