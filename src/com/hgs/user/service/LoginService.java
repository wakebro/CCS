package com.hgs.user.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hgs.user.model.UserDAO;
import com.hgs.user.model.UserVO;

public class LoginService implements UService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("login_id");
		String pw = request.getParameter("login_pw");
		HttpSession session = request.getSession();
		
		UserDAO dao = UserDAO.getInstace();
		UserVO user = new UserVO();
		user.setId(id);
		user.setPw(pw);
		UserVO userInfo = dao.login(user);
		String userDept = dao.getUserDept(userInfo.getDept_no());
		
		session.setAttribute("userInfo", userInfo);
		session.setAttribute("userDept", userDept);
	}
}
