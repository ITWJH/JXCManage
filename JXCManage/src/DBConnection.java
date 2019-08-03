import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con;//声明Connection对象,Connection是一个接口
	public Connection getConnection() {
		try {
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);//SQL数据库引擎
//			System.out.println("ok1");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {//通过访问数据库的URL,获得数据库连接对象
			String url = "jdbc:sqlserver://localhost:1433;databasename=JXCManage";
			String user = "sa";
			String password = "123456";
			con = DriverManager.getConnection(url,user,password);
//			System.out.println("ok2");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
