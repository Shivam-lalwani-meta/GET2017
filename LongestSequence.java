import java.util.Scanner;


public class LongestSequence {
	
	static int[] getLS(int[] input){
		int start_index=0;
		int end_index=0;
		int length=1;
		int max_length=1;
		int max_start=0;
		int max_end=0;
		for(int i=0;i<input.length-1;i++){
			if(input[i]<input[i+1]){
				end_index++;
				length++;
			}
			else{
			 
				if(length>max_length){
					max_start=start_index;
					max_end=end_index;
				}
			start_index=i+1;
			end_index=start_index;
			length=0;
			}
			
		}
		if(length>max_length){
			max_start=start_index;
			max_end=end_index;
		}
		int[] res=new int[max_end-max_start+1];
		for(int i=max_start,k=0;i<=max_end;i++)
			res[k++]=input[i];
		
		
		return res;
	}

		public static void main(String args[]){
			
			  System.out.print("Enter number of elements to be inserted");
			  Scanner sc= new Scanner(System.in);
			  int n=sc.nextInt();
			  int[] arr= new int[n];
	
				for(int i=0;i<n;i++){
				arr[i]= sc.nextInt();
				}	
				
			  int[] new_arr= getLS(arr);
			 for(int j = 0; j<new_arr.length; j++)
		    {
		        System.out.print(+new_arr[j]);
		    }
		}

}

