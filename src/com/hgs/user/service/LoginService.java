package com.hgs.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hgs.user.model.UserDAO;
import com.hgs.user.model.UserVO;

public class LoginService implements UService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("login_id");
		String pw = request.getParameter("login_pw");
		
		UserDAO dao = UserDAO.getInstace();
		UserVO user = new UserVO();
		user.setId(id);
		user.setPw(pw);
		UserVO userInfo = dao.login(user);
		
		request.setAttribute("userInfo", userInfo);
	}
}
