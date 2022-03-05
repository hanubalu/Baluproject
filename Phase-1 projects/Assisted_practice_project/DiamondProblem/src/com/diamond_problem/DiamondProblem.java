package com.diamond_problem;

		interface First 
		{  
		    default void view() 
		    { 
		        System.out.println("First excute"); 
		    } 
		} 
		interface Second 
		{  
		    default void view() 
		    { 
		        System.out.println("Second excute"); 
		    } 
		}  
		public class DiamondProblem implements First, Second 
		{  
		    public void view() 
		    {  
		        First.super.view(); 
		        Second.super.view(); 
		    } 
		    public static void main(String args[]) 
		    { 
		    	DiamondProblem ob = new DiamondProblem(); 
		        ob.view(); 
		    } 
		}

