// to check longest sequence in an array
package assignment;


public class LongestSequence {
		public static void main(String args[]) {
			
			int[] array = {1,2,3,4,1,2,4,5,6,7,8,1,2}; //input array
			int[] newarray = findLongestSequence(array);
			
		}	
		
		//method to find longest sequence in an input array
		public static int[] findLongestSequence(int[] array) {
			
				
				int i=0,j=1,final_index=0;
				int initial_index=1, length=0, count = 1;
				
					while(j < array.length) {
							if(array[i] < array [j]) {
					
								i++;
								j++;
								count++;
								
							}
							
							else {
								
									if(count<length)
									{	
										length=count;
										count=1;
										i=j;
										j++;
										
									}
									
									else {
										initial_index= count-i+3;
										final_index=j-2;
										j++;
									}
									
								}
							
								
							}
					return printing(array, initial_index,final_index);
					
					}
		
					
					
					public static int[] printing(int[] array, int initial_index,int final_index) {
						int[] array1 = new int[final_index-initial_index+1];
						for(int z= initial_index,k=0;z<=final_index && k < array1.length;z++) {
						
							array1[k]=array[z];
							System.out.print(+array1[k]);
							k++;
					}
						return array1;
							
		}
	
}
