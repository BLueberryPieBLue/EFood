package com.food.servlet;

import java.io.IOException;
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


public class ShowList extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		HttpSession session = req.getSession();
		User user=(User) session.getAttribute("loginUser");
		if(user==null) {
			resp.getWriter().println("您还没有登录,请<a href='/Efood/login.jsp'>登录<a/>");
		}else {
			Cookie cookie = new Cookie("JSESSIONID",session.getId());
			cookie.setMaxAge(60*30);
			cookie.setPath("/Efood");
			resp.addCookie(cookie);
			DishDao dishdao =new DishDaoImpl();
			List<Dish> dishes=dishdao.SelectAllDish();
			req.setAttribute("dishes", dishes);
			req.getRequestDispatcher("main.jsp").forward(req, resp);
		}
		
	}

}