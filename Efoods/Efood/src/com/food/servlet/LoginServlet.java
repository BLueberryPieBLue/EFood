package com.food.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.beans.User;
import com.food.beans.UserDaoImpl;
import com.food.dao.UserDao;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		String username=req.getParameter("username");
		String password=req.getParameter("password");

		UserDao userDao=new UserDaoImpl();
		User user;
		try {
			user = userDao.getUserByUsernameAndPassword(username, password);
			if(user!=null) {
				HttpSession session=req.getSession();
				session.setAttribute("loginUser", user);
				resp.sendRedirect("main");
			}else {
				req.setAttribute("login_msg", "用户名或者密码错误!");
				RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
