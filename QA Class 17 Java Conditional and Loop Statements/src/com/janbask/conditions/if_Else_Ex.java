package com.janbask.conditions;

public class if_Else_Ex {

	public static void main(String[] args) {
		
		int age = 55;
		String name="Paul";
		
		
		if(age>60)
		{	
			System.out.println(name+ " is a senior citizen");
		    System.out.println(name +" is eligible for pension");
		}   
		else {
			System.out.println(name +" is not senior citizen");
		System.out.println(name +" is not eligible for pension");
		}
	}

}
