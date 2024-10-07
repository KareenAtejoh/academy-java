package com.bptn.course._06_00p;

class SalesDepartment extends Department {

	private double totalSalesAmount; 
	
	public SalesDepartment(String Name, int numberOfEmployees, double totalSalesAmount);
	super(departmentName, numberOfEmployees);
	this.totalSalesAmount = totalSalesAmount;
	
}
}