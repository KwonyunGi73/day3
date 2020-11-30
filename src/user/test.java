package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
		public static void main(String[] args) {
			try {
				String dburl="jdbc:mysql://localhost:3306/mysql";
				String dbuser="root";
				String dbpass="1234";
				Class.forName("org.gjt.mm.mysql.Driver");
				System.out.println("드라이버 있음");
				Connection conn=DriverManager.getConnection(dburl, dbuser, dbpass);
				System.out.println("===>"+conn);
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 없다");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
