import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con;//����Connection����,Connection��һ���ӿ�
	public Connection getConnection() {
		try {
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);//SQL���ݿ�����
//			System.out.println("ok1");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {//ͨ���������ݿ��URL,������ݿ����Ӷ���
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
