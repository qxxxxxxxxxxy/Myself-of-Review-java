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
	
	//��PareparedStatement ���Է�ֹsql���ע��

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
/*		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","");
		PreparedStatement p = conn.prepareStatement("update customers set age = 58 where name" + "=" +"'��ְ�'");
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
        /* ��
         * ��д������� ������!!!!!!
         * д���ݿ������!!!!!!!!! 
         */
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conna = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","");
//		PreparedStatement d = conna.prepareStatement("select * from customers");
//		ResultSet sss = d.executeQuery();
//		while(sss.next()) {
//			String name = sss.getString("name");
//			�Դ�����
//		}
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db","root","");
		PreparedStatement s = conn.prepareStatement("update customers set age = 60 where  name" +"=" +"'��ְ�'");
		//�������ʱ����µķ���ֵ��һ������ ���³ɹ���1 ���²��ɹ���0
		int d = s.executeUpdate(); 
		s = conn.prepareStatement("select * from customers");
		ResultSet ss = s.executeQuery();
	}
}
