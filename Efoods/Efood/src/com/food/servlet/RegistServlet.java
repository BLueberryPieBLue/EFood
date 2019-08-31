package com.food.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.beans.User;
import com.food.beans.UserDaoImpl;
import com.food.dao.UserDao;

public class RegistServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String username=req.getParameter("username");
		String password=req.getParameter("password");

		UserDao userDao=new UserDaoImpl();
		User user = userDao.getUserByUsername(username);
		if(user!=null) {
			req.setAttribute("regist_msg", "用户名已存在");
			req.getRequestDispatcher("regist.jsp").forward(req, resp);
		}else {
			userDao.insertUser(username, password);
			resp.sendRedirect("login.jsp");
		}
		

		
	}
}
