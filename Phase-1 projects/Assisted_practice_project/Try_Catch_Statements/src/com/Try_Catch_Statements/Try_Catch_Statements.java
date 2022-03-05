package com.Try_Catch_Statements;

public class Try_Catch_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = new int[4];
	        try 
	        {
	            array[10] = 5;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }

	}

}
