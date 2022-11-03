package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Paitent;

@Repository("oraDAO")
public class PaitentDAOOracleImpl implements IPaitentDAO {
	private static final String GET_PAITENT_BY_LOCATION = "SELECT * FROM  CORONA_PATIENT_INFO WHERE STATE IN(?,?,?) ";

	@Autowired
	private DataSource ds;

	@Override
	public List<Paitent> getPaitentDetailByState(String state1, String state2, String state3) throws Exception {
		List<Paitent> list = null;
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_PAITENT_BY_LOCATION)) {
			// set param values
			ps.setString(1, state1);
			ps.setString(2, state2);
			ps.setString(3, state3);
//execute query
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList();
				while (rs.next()) {
					Paitent paitent = new Paitent();
					paitent.setPid(rs.getInt(1));
					paitent.setPname(rs.getString(2));
					paitent.setPadd(rs.getString(3));
					paitent.setTotalbill(rs.getFloat(4));
					paitent.setState(rs.getString(5));
					list.add(paitent);
				} // while
			} // try2
		} // try1
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}// method(-,-)
}// class
