package com.ConstructorTypes;

public class ConstructorTypes {

	public static void main(String[] args) {
		new constructor();
		new constructor("former");
		new constructor("Balu",'Z');
		new constructor("shiva",'Y',1000);

		}

	}

	class constructor{
		public constructor() {                         //Zero constructor
			System.out.println("disply constructor");
		}
		public constructor(String name) {              //Parameterized constructor
			System.out.println("the User name :"+name);
		}
		// constructor Overloaded 
		public constructor(String name,char sec) {       
			System.out.println("Employee name :"+name+"\nsection :"+sec);
		}
		public constructor(String name,char sec,int id) {
			System.out.println("Employee name :"+name+"\nsection :"+sec+"\nEmploy ID :"+id);
	}

}
