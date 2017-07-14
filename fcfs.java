
public class fcfs {

	public static int[][] getWaitingTime(int[] arrival_time,int[] job_size){
		int [][] output=new int[arrival_time.length][5];
		
		
		

		output[0][3]=arrival_time[0];
		
		
		for(int i=0;i<arrival_time.length;i++){			//funtion for job no
			output[i][0]=i+1;
		}	
		
		for(int i=0;i<arrival_time.length;i++){			//funtion for job arrived time 
			output[i][1]=arrival_time[i];
		}
		
		for(int i=1;i<arrival_time.length;i++){			//funtion for wait time
			output[i][3]=Math.max(output[i-1][3]+job_size[i-1],arrival_time[i]);
			
		}
		
		for(int i=0;i<arrival_time.length;i++){			//funtion for start time
			
			output[i][2]=output[i][3]-output[i][1];
		}
		
		for(int i=0;i<arrival_time.length;i++)			//funtion for finish time
			output[i][4]=output[i][3]+job_size[i]-1;
		
	
		return output;
		
	}
	
	public static void main(String args[]){
		
		int[] arrival_time={1,5,9,25};
		int[] job_size={12,7,2,5};
		
		int rows = 4;
		int columns = 5;

		int[][] output = getWaitingTime(arrival_time,job_size);

	

		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(output[i][j]);
		    }
		    System.out.println("");
		}
	}
	
}
