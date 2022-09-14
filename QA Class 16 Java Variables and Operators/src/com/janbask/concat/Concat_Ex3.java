package com.janbask.concat;

public class Concat_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b=5;
		String name="Sam";
		
		System.out.println(a+b);//15
		System.out.println(b+a);//15
		System.out.println(a+b+name);//15Sam
		System.out.println(name+a+b);//Sam15
		System.out.println((a+b)+name);//15Sam
		System.out.println(name+(a+b));//Sam15
		System.out.println(a+name+b);//10Sam5
		

	}

}
