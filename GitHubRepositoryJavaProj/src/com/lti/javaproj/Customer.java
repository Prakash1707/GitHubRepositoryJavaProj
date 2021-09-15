package com.lti.javaproj;

public class Customer {
	private int id;
	private String name;
	private double bill;
	public Customer(int prdId, String prdName, double prdCost) {
		super();
		this.id = prdId;
		this.name = prdName;
		this.bill = prdCost;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int prdId) {
		this.id = prdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String prdName) {
		this.name = prdName;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double prdCost) {
		this.bill = prdCost;
	}
}
