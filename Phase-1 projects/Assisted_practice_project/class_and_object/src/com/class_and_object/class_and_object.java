package com.class_and_object;
public class class_and_object {
			String name; 
		    String breed; 
		    int age; 
		    String color; 
		    public class_and_object(String name, String breed, int age, String color) {
				// TODO Auto-generated constructor stub
		    	 this.name = name; 
		         this.breed = breed; 
		         this.age = age; 
		         this.color = color;
			} 
		    public String getName() 
		    { 
		        return name; 
		    } 
		    public String getBreed() 
		    { 
		        return breed; 
		    } 
		    public int getAge() 
		    { 
		        return age; 
		    } 
		    public String getColor() 
		    { 
		        return color; 
		    } 
		    @Override
		    public String toString() 
		    { 
		        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and " + this.getColor() + "."); 
		    } 
		    public static void main(String[] args) 
		    { 
		    	class_and_object scott = new class_and_object("Hanu","Papillon",15,"Black");
		        System.out.println(scott.toString()); 
		    } 
	}

