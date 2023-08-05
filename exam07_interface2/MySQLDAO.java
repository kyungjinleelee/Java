package exam07_interface2;

public class MySQLDAO implements DBDAO{
	
	// mysql 연동하는 메서드
	@Override
		public void connect(){
			System.out.println("MySQLDAO.connect_mysql");
		}
}
