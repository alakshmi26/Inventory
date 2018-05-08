package com.java.action;

import java.sql.ResultSet;

import com.java.dao.InventoryDB;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3261206071496095134L;
	private String prodId = "", prodName = "", prodDesc = "", prodIdhidden="";
	private String msg = "";
	ResultSet rs = null;
	InventoryDB dao = new InventoryDB();
	String submitType;

	@Override
	public String execute() throws Exception {
				rs = dao.fetchInventoryDetails(prodId.trim());				
				if (rs != null) {
					int i = dao.updateInventoryDetails(prodId, prodName, prodDesc, prodIdhidden);
					if (i > 0) {
						msg = "Record Updated Successfuly";
					} else {
						msg = "error";
					}
					
			}

		

		return "UPDATE";
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	
	public String getProdID() {
		return prodId;
	}

	public void setProdIdhidden(String prodIdhidden) {
		this.prodIdhidden = prodIdhidden;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}
}