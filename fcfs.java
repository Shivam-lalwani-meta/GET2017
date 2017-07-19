
public class fcfs {

			public static int[][] getInfoOfJob(int[] arrival_time,int[] job_size){
				
				int [][] output_array=new int[arrival_time.length][5];
		
				output_array[0][3]=arrival_time[0];
		
					//funtion for job no
					for(int i=0;i<arrival_time.length;i++){
						output_array[i][0]=i+1;
					}
					
					//funtion for job arrived time 
					for(int i=0;i<arrival_time.length;i++){
						output_array[i][1]=arrival_time[i];
					}
					
					//funtion for wait time
					for(int i=1;i<arrival_time.length;i++){
						output_array[i][3]=Math.max(output_array[i-1][3]+job_size[i-1],arrival_time[i]);
						
					}
					
					//funtion for start time
					for(int i=0;i<arrival_time.length;i++){
						
						output_array[i][2]=output_array[i][3]-output_array[i][1];
					}
					
					//funtion for finish time
					for(int i=0;i<arrival_time.length;i++) {
						output_array[i][4]=output_array[i][3]+job_size[i]-1;
					}
				
					return output_array;
		
			}
	
		public static void main(String args[]) {
			
			int[] arrival_time = {1,5,9,25};  //job arrival array
			int[] job_size = {12,7,2,5};	  //job size array	
			
			int[][] output = getInfoOfJob( arrival_time, job_size);
				
				System.out.print("Job Arrival time wait time start time finish"+"\n");
				
				//to print output array
				for(int i = 0; i < arrival_time.length; i++) {
					for(int j = 0; j < 5; j++) {
						System.out.print(+output[i][j]+" ");
					}
					System.out.print("\n");
				}
		}
}
