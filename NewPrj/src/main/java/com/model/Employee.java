package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table (name="emp_projtab")
public class Employee {
	@Id	
	@Column (name="eid")
	private int empId;
	@Column (name="ename")
	private String empName;
	@Column (name="esal")
	private double empSal;
	@ElementCollection
	@CollectionTable (name="empprojstab" ,joinColumns=@JoinColumn(name="eid"))
	@OrderColumn(name="pos")
	@Column(name="data")
	private List<String> eprjs=new ArrayList<String>();

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public List<String> getEprjs() {
		return eprjs;
	}

	public void setEprjs(List<String> eprjs) {
		this.eprjs = eprjs;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", eprjs=" + eprjs + "]";
	}

}
