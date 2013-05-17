<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page language="java" pageEncoding="UTF-8" %>
<%
Context initCtx = new InitialContext();
Context envCtx = (Context) initCtx.lookup("java:comp/env");
DataSource ds = (DataSource)
  envCtx.lookup("jdbc/myDataSource");

Connection conn = ds.getConnection();
System.out.println(conn);
conn.close();
%>
<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
