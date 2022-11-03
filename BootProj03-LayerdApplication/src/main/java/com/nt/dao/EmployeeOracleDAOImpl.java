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

import com.nt.model.Employee;

@Repository("oraDAO")
public class EmployeeOracleDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_DESGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource ds; 

	@Override
	public List<Employee> getEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeOracleDAOImpl.getEmployeeByDesgs()"+ds.getClass());
		List<Employee> list = null;
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESGS);) {
			// Set the param values
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			// execute query
			try (ResultSet rs = ps.executeQuery();) {
				// copy records to LIst<Employee>
				list = new ArrayList();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getInt(4));
					emp.setDeptNo(rs.getInt(5));
					list.add(emp);
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
	}// method

}// class
