package com.sgtest.tests;
interface Product
{
	void showProductName(String name);
}
interface Customer
{
	void displayCustomerName(String name);
}

class OrderDetails implements Product, Customer
{

	@Override
	public void displayCustomerName(String name) {
		System.out.println("Customer Name :"+name);
		
	}

	@Override
	public void showProductName(String name) {
		System.out.println("Product Name :"+name);
		
	}
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Product product=new OrderDetails();
		product.showProductName("Lenovo Laptop");
		
		Customer customer= (Customer) product;
		customer.displayCustomerName("S G Software Testing Institute");
	}

}
