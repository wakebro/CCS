package com.hgs.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hgs.user.model.UserDAO;
import com.hgs.user.model.UserVO;

public class JoinProcService implements UService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		UserVO user = new UserVO();
		UserDAO dao = UserDAO.getInstace();
		String dept_no_=request.getParameter("join_dept");
		user.setName(request.getParameter("join_name"));
		user.setId(request.getParameter("join_id"));
		user.setPw(request.getParameter("join_pw"));
		user.setDept_no(Integer.parseInt(dept_no_));
		user.setPhone(request.getParameter("join_phone"));
		user.setEmail(request.getParameter("join_email"));
		
		dao.join(user);
	}
}
