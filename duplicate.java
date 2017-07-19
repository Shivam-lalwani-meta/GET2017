
import java.io.*;
import java.util.Scanner;
public class duplicate {
	
	public static int[] removeDuplicates(int[] input){
        
        int j=0;
        int i=1;
        if(input.length<2){			//return if the array length is less than 2
            return input;
        }
        while(i<input.length){
            if(input[i] ==input[j]){
                i++;
            }else{
                input[++j] =input[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length-1; k++){
            output[k] = input[k];
        }
         
        return output;
		
	}
  


public static void main(String args[])
{
  /*int[] sorted= {1,2,2,1,3,4,5,5,5,4};
  int[] output= removeDuplicate(sorted);
  
  for(int i:output)
  {
	System.out.print(i+ "");
  }*/
	
	System.out.print("Enter number of elements to be inserted");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr= new int[n];
	
	for(int i=0;i<n;i++){
		arr[i]= sc.nextInt();
	}
	
	int[] output= removeDuplicates(arr);
	
	for(int i=0;i<n-1;i++){
		System.out.print(+output[i]);
	}
}
}