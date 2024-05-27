package com.sgtesting.interfacedemo;
interface Reports
{
	void pdfReports();
	void excelReports();
	default void htmlReports()
	{
		System.out.println("This is default Method, It geenrates html Reports");
	}
}

class Incentive implements Reports
{

	@Override
	public void pdfReports() {
		System.out.println("This method generates pdf Reports!!!");
		
	}

	@Override
	public void excelReports() {
		System.out.println("This method generates Excel Reports!!!");
		
	}
	
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Incentive o=new Incentive();
		o.pdfReports();
		o.excelReports();
		o.htmlReports();
	}

}
