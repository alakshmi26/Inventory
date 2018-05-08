package com.java.action;

import com.java.dao.InventoryDB;
import com.opensymphony.xwork2.ActionSupport;

public class NewProductAction extends ActionSupport { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private String prodId, prodName, prodDesc;
	InventoryDB inventory = null;
	private String msg = "";
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		inventory = new InventoryDB();

		try {
			ctr = inventory.insertValues(prodId, prodName, prodDesc);
			if (ctr > 0) {
				msg = "Registration Successfull";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}
}

