package com.hgs.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hgs.user.model.UserDAO;
import com.hgs.user.model.UserVO;

public class UpdateService implements UService {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		UserDAO dao = UserDAO.getInstace();
		UserVO user = new UserVO();
		user.setId(request.getParameter("update_id"));
		user.setPw(request.getParameter("update_pw"));
		user.setPhone(request.getParameter("update_phone"));
		user.setEmail(request.getParameter("update_email"));
		
		dao.update(user);
	}
}
