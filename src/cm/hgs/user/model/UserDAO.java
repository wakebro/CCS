package cm.hgs.user.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {

	private DataSource ds;

	public UserDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static UserDAO dao = new UserDAO();

	public UserDAO getinstance() {
		return dao;
	}

	public List<String> getDept() {
		System.out.println("getDept실행");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<String> result = new ArrayList<String>();
		String sql = "SELECT * FROM dept";

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String dept;
				dept = rs.getString("name");
				result.add(dept);
			}
		} catch (SQLException e) {
			System.out.println("에러코드 : " + e);
		}
		return result;
	}// end getDept
}
