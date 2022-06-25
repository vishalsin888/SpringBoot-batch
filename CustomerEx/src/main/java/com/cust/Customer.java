package com.cust;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderBy;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="custs")
public class Customer {

	@Id
	@Column(name="cid")
	private int custId;
	@Column(name="cname")
	private String custName;
	@Column(name="caccount")
	private String custAccount;
	
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name="cust_addr" , joinColumns = @JoinColumn(name="cid"))
	@OrderColumn(name="cadd")
	@Column(name="caddress")
	private List<String> custAddr;

	public Customer() {
		super();
	}

	public Customer(int custId, String custName, String custAccount, List<String> custAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAccount = custAccount;
		this.custAddr = custAddr;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAccount() {
		return custAccount;
	}

	public void setCustAccount(String custAccount) {
		this.custAccount = custAccount;
	}

	public List<String> getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(List<String> custAddr) {
		this.custAddr = custAddr;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAccount=" + custAccount + ", custAddr="
				+ custAddr + "]";
	}
		
}
