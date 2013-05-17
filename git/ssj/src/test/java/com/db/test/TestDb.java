package com.db.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.junit.Test;

public class TestDb {
 
	@Test
	public void getCon() throws NamingException, SQLException{
		
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)
		  envCtx.lookup("jdbc/myDataSource");

		Connection conn = ds.getConnection();
		System.out.println(conn);
		conn.close();
	}
}
