package AppQLgiay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import AppQLgiay.ConnectDB;
import AppQLgiay.BanGiay;

public class BanGiayDAO {
	
	public static ArrayList<BanGiay> getBanGiayAll() {
		Connection con=ConnectDB.connect();
		Statement stm;
		ArrayList<BanGiay> list=new ArrayList<BanGiay>();
		try {
			stm = con.createStatement();
			ResultSet rs= stm.executeQuery("select * from QLgiay");
			while(rs.next())
			{
				BanGiay lop=new BanGiay();
				lop.setLoai(rs.getString(1));
				lop.setMau(rs.getString(2));
				lop.setSoluong(rs.getString(3));
				lop.setMa(rs.getString(4));
				lop.setSize(rs.getString(5));
				lop.setGia(rs.getString(6));
				list.add(lop);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public static void insertlop(BanGiay lop) {
		Connection con = ConnectDB.connect();
		Statement stm;
		try{
			 stm = con.createStatement();
			 stm.executeUpdate("insert into QLgiay values ('"+ lop.getLoai()+"','"+lop.getMau()
			 												+lop.getSoluong()+"','"+lop.getMa()
			 												+lop.getMa()+"','"+lop.getSize()+"','"+lop.getGia()+"')");
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
