package Review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JDBC {
	
	//用PareparedStatement 可以防止sql语句注入

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
/*		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","");
		PreparedStatement p = conn.prepareStatement("update customers set age = 58 where name" + "=" +"'你爸爸'");
		int a = p.executeUpdate();
		p = conn.prepareStatement("select * from customers");
		ResultSet st = p.executeQuery();
		while(st.next()) {
			String e = st.getString("name");
			String b = st.getString("age");
			String c = st.getString("sex");
			String d = st.getString("id");
			System.out.println(e + "" + b);
			
		}*/
        /* 此
         * 次写这个代码 忘记了!!!!!!
         * 写数据库的名字!!!!!!!!! 
         */
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conna = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","");
//		PreparedStatement d = conna.prepareStatement("select * from customers");
//		ResultSet sss = d.executeQuery();
//		while(sss.next()) {
//			String name = sss.getString("name");
//			以此类推
//		}
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","");
		PreparedStatement s = conn.prepareStatement("update customers set age = 60 where  name" +"=" +"'你爸爸'");
		//用这个的时候更新的返回值是一个整形 更新成功是1 更新不成功是0
		int d = s.executeUpdate(); 
		s = conn.prepareStatement("select * from customers");
		ResultSet ss = s.executeQuery();
	}
}
