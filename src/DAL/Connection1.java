package DAL;


 

import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Connection1 {
	public static Connection conn = null;
        public static Statement statement = null;
	public static ResultSet result = null;
        public static ResultSetMetaData rmsd = null;
	public Connection1()  {
		try {
			String connectionURL = "jdbc:sqlserver://DESKTOP-1SGEUSL\\KAY:1433;encrypt=true;databaseName=PBL3;integratedSecurity=true;trustServerCertificate=true;";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(connectionURL);
			statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch (SQLException e)
		{
			System.out.println("SQL: " + e.toString());
		
		}catch (ClassNotFoundException e) {
			System.out.println("Ket noi co so du lieu that bai");
			System.err.println(e.getMessage()+ "\n" + e.getClass() + "\n" + e.getCause());
		}
	}
        

}
