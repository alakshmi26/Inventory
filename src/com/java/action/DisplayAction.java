package com.java.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.java.bean.InventoryDetails;
import com.java.dao.InventoryDB;
import com.opensymphony.xwork2.ActionSupport;

public class DisplayAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
	InventoryDetails inventoryDetails = null;
	List<InventoryDetails> detailsList = null;
	InventoryDB inventory = new InventoryDB();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			detailsList = new ArrayList<InventoryDetails>();
			rs = inventory.inventoryReport();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					inventoryDetails = new InventoryDetails();					
					inventoryDetails.setProdId(rs.getString("prodId"));
					inventoryDetails.setProdName(rs.getString("prodName"));
					inventoryDetails.setProdDesc(rs.getString("prodDesc"));
					detailsList.add(inventoryDetails);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REPORT";
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}

	public List<InventoryDetails> getDetailsList() {
		return detailsList;
	}

	public void setBeanList(List<InventoryDetails> detailsList) {
		this.detailsList = detailsList;
	}
}