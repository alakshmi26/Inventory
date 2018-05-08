package com.java.action;

import com.java.dao.InventoryDB;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String prodId, msg;
	InventoryDB dao = new InventoryDB();

	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteInventoryDetails(prodId);
			if (isDeleted > 0) {
				msg = "Record deleted successfully";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}