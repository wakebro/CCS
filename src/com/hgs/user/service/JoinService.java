package com.hgs.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.hgs.user.model.UserDAO;

public class JoinService implements UService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		UserDAO dao = new UserDAO().getinstance();
		List<String> dept = dao.getDept();
	}
}
