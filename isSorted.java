/*
	 function to check given array is in sorted order or not.
	 Function should return 1 if array is in ascending order, 
	 2 if array is in descending order, 
	 0 if array is not in sorted.
*/

import java.io.*;
import java.util.Scanner;
public class isSorted {
	
	public static void main(String args[]){
		
		System.out.println("Enter number of elements to be inserted");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0; i<array.length;i++){
			
			array[i]=sc.nextInt();
		}
		
		int a= isSort(array);
		System.out.println(+a);
		
	}


	public static int isSort(int[] array){
		
		int c=0,d=0;		//counters
		for (int k=0; k<array.length-1;k++){
			
			if(array[k]<array[k+1]){  //ascending array
				c+=1;			
				continue;				//check till last element
				
			}
		}
		
		for (int k=0; k<array.length-1;k++){	
			
			if(array[k]>array[k+1]){				//descending array
				
				d+=1;
				continue;							//check till last element
				
			}
		}
		
		if(c>=array.length-1)
		{return 1;}
		if(d>=array.length-1)
		{return 2;}
		else {return 0;}

}
}/*
	 function to check given array is in sorted order or not.
	 Function should return 1 if array is in ascending order, 
	 2 if array is in descending order, 
	 0 if array is not in sorted.
*/

import java.io.*;
import java.util.Scanner;
public class isSorted {
	
	public static void main(String args[]){
		
		System.out.println("Enter number of elements to be inserted");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0; i<array.length;i++){
			
			array[i]=sc.nextInt();
		}
		
		int a= isSort(array);
		System.out.println(+a);
		
	}


	public static int isSort(int[] array){
		
		int c=0,d=0;		//counters
		for (int k=0; k<array.length-1;k++){
			
			if(array[k]<array[k+1]){  //ascending array
				c+=1;			
				continue;				//check till last element
				
			}
		}
		
		for (int k=0; k<array.length-1;k++){	
			
			if(array[k]>array[k+1]){				//descending array
				
				d+=1;
				continue;							//check till last element
				
			}
		}
		
		if(c>=array.length-1)
		{return 1;}
		if(d>=array.length-1)
		{return 2;}
		else {return 0;}

}
}/*
	 function to check given array is in sorted order or not.
	 Function should return 1 if array is in ascending order, 
	 2 if array is in descending order, 
	 0 if array is not in sorted.
*/

import java.io.*;
import java.util.Scanner;
public class isSorted {
	
	public static void main(String args[]){
		
		System.out.println("Enter number of elements to be inserted");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0; i<array.length;i++){
			
			array[i]=sc.nextInt();
		}
		
		int a= isSort(array);
		System.out.println(+a);
		
	}


	public static int isSort(int[] array){
		
		int c=0,d=0;		//counters
		for (int k=0; k<array.length-1;k++){
			
			if(array[k]<array[k+1]){  //ascending array
				c+=1;			
				continue;				//check till last element
				
			}
		}
		
		for (int k=0; k<array.length-1;k++){	
			
			if(array[k]>array[k+1]){				//descending array
				
				d+=1;
				continue;							//check till last element
				
			}
		}
		
		if(c>=array.length-1)
		{return 1;}
		if(d>=array.length-1)
		{return 2;}
		else {return 0;}

}
}/*
	 function to check given array is in sorted order or not.
	 Function should return 1 if array is in ascending order, 
	 2 if array is in descending order, 
	 0 if array is not in sorted.
*/

import java.io.*;
import java.util.Scanner;
public class isSorted {
	
	public static void main(String args[]){
		
		System.out.println("Enter number of elements to be inserted");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] array= new int[n];
		
		for(int i=0; i<array.length;i++){
			
			array[i]=sc.nextInt();
		}
		
		int a= isSort(array);
		System.out.println(+a);
		
	}


	public static int isSort(int[] array){
		
		int c=0,d=0;		//counters
		for (int k=0; k<array.length-1;k++){
			
			if(array[k]<array[k+1]){  //ascending array
				c+=1;			
				continue;				//check till last element
				
			}
		}
		
		for (int k=0; k<array.length-1;k++){	
			
			if(array[k]>array[k+1]){				//descending array
				
				d+=1;
				continue;							//check till last element
				
			}
		}
		
		if(c>=array.length-1)
		{return 1;}
		if(d>=array.length-1)
		{return 2;}
		else {return 0;}

}
}