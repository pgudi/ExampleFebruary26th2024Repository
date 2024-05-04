package com.sgtesting.scenarios;
class Sample
{
	static int addition(int x, int y)
	{
		return (x + y);
	}
}
public class SampleDemo {

	public static void main(String[] args) {
		int z=Sample.addition(20, 50);
		System.out.println(z);

		Sample.addition(100, 400);
	}

}
