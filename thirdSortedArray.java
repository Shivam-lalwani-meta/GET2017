
public class thirdSortedArray {
	
	public static void main(String[] args){
		int arr1[]={4,6,9,20,56};
		int arr2[]={1,7,25,45,70};
		int[] result=merge(arr1, arr2);
		for (int j=0; j<result.length;j++){
		System.out.print(result[j]+ " ");
	
		}
	}	
	
	public static int[] merge(int[] arr1, int[] arr2)
	{	
		int[] arr3= new int[arr1.length + arr2.length];
		int i=0,j=1,k=0;
		
		while(i<arr1.length&&j<arr2.length)
		{	
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}else
			{
				arr3[k] = arr2[j];
				j++;
				k++;
			}	
		}	
		
		
		
		return arr3;
		
		
	}
	

}

