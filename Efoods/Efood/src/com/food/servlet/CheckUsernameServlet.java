package com.food.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.beans.User;
import com.food.beans.UserDaoImpl;
import com.food.dao.UserDao;

public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("username");
		
		UserDao userDao=new UserDaoImpl();
		
		User user =userDao.getUserByUsername(username);
		String msg="";
		if(username=="") {
			msg="2";
		}else 
		if(user==null) {
			msg="1";
		}else {
			msg="0";
		}
		response.setContentType("text/html;charset=utf-8");
		
		response.getWriter().println(msg);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
