package com.java.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.java.util.DBConn;

public class InventoryDB {	
	

	Connection conn;
	DBConn dbConn=new DBConn();	
	int dbResult;
	
	//method to insert values
	public int insertValues(String prodId, String prodName, String prodDesc) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO inventory VALUES (?,?,?)";
			PreparedStatement ps = dbConn.getDBConnection().prepareStatement(sql);
			ps.setString(1, prodId);
			ps.setString(2, prodName);
			ps.setString(3, prodDesc);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (dbConn.getDBConnection() != null) {
				dbConn.getDBConnection().close();
			}
		}
	}
	
	// method to fetch saved records
	public ResultSet inventoryReport() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT prodId,prodName,prodDesc FROM inventory";
			PreparedStatement ps = dbConn.getDBConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (dbConn.getDBConnection() != null) {
				dbConn.getDBConnection().close();
			}
		}
	}

	// method for fetch old data to be update
	public ResultSet fetchInventoryDetails(String prodId) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT prodId,prodName,prodDesc FROM inventory WHERE prodId=?";
			PreparedStatement ps = dbConn.getDBConnection().prepareStatement(sql);
			ps.setString(1, prodId);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (dbConn.getDBConnection() != null) {
				dbConn.getDBConnection().close();
			}
		}
	}

	// method to update data in database
	public int updateInventoryDetails(String prodId, String prodName, String prodDesc, String prodIdhidden)
			throws SQLException, Exception {
		dbConn.getDBConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "UPDATE inventory SET prodId=?, prodName=?,prodDesc=? WHERE prodId=?";
			PreparedStatement ps = dbConn.getDBConnection().prepareStatement(sql);
			ps.setString(1, prodId);
			ps.setString(2, prodName);	
			ps.setString(3, prodDesc);
			ps.setString(4, prodIdhidden);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			dbConn.getDBConnection().rollback();
			return 0;
		} finally {
			if (dbConn.getDBConnection() != null) {
				dbConn.getDBConnection().close();
			}
		}
	}

	// method for delete the record
	public int deleteInventoryDetails(String prodId) throws SQLException, Exception {
		dbConn.getDBConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "DELETE FROM inventory WHERE prodId=?";
			PreparedStatement ps = dbConn.getDBConnection().prepareStatement(sql);
			ps.setString(1, prodId);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			dbConn.getDBConnection().rollback();
			return 0;
		} finally {
			if (dbConn.getDBConnection() != null) {
				dbConn.getDBConnection().close();
			}
		}
	}
	
	
}
