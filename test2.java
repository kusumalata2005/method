package com.tka;

public class test2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Demographics dd = person.getdetails(23,"priya");
		
		Location ll = dd.giveaddress();
		
		String ttt = ll.getcityname();
		
		System.out.println(ttt);

	}

}
