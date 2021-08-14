package com.hgs.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginService implements UService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String login_id = request.getParameter("login_id");
		String login_pw = request.getParameter("login_pw");
		System.out.println(login_id);
		System.out.println(login_pw);
	}
}
