package com.hgs.user.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.hgs.dept.model.DeptVO;
import com.hgs.user.model.UserVO;

public class UserDAO {

	private DataSource ds;

	private UserDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static UserDAO dao = new UserDAO();

	public static UserDAO getInstace() {
		return dao;
	}
	// 회원가입 부서정보
	public List<DeptVO> getDept() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DeptVO> result = new ArrayList<DeptVO>();
		String sql = "SELECT * FROM dept";

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DeptVO dept = new DeptVO();
				dept.setDept_no(rs.getInt("dept_no"));
				dept.setDept_name(rs.getString("name"));
				result.add(dept);
			}
		} catch (SQLException e) {
			System.out.println("에러코드 : " + e);
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}// end getDept
	// 회원가입
	public void join(UserVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("에러코드 : " + e);
		}
				
	}

}
