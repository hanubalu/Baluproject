package com.linear_search;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] arr = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int searchValue = sc.nextInt();
            int result = linearing(arr,searchValue);
            if(result==-1){
                System.out.println("Element not in the array");
            } else {
                System.out.println("Element found at "+result+" and the search key is "+arr[result]);
            }
        }
public static int linearing(int arr[], int x) {

    
    for (int i = 0; i < arr.length; i++) {//O(n)

        if (arr[i] == x) {

            return i;

         }
     }

            return -1;

   }
}
