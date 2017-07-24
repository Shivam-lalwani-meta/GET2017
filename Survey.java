/**
 * 
 * @author Shivam
 * @Date: 20-07-2017
 * Class Name: Survey 
 * @description This class is to take a survey of an organisation, and the result of feedbacks is
 * converted to statistics.
 *
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Survey implements Comparable<Survey> {
	public static void main(String args[]) throws IOException {
		int percentage[]=new int[5];
		int i=0,num=0,q=0;
		BufferedWriter br2 = null;
		BufferedReader br = null;
		List<String> singleSelectList = new ArrayList<String>();
		List<String> multipleSelectList = new ArrayList<String>();
		String question[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of user");
		int user = sc.nextInt();
		
		try {
			br2 = new BufferedWriter(new FileWriter("E:\\new.txt"));	//to connect to a output file
		} catch (FileNotFoundException e) {
			System.out.print("Error in fetching file");
			e.printStackTrace();
		  }
		
		for(int noOfUser=0;noOfUser<user;noOfUser++) {	//for the number of user the feedback form will be re-displayed
			try {
				br = new BufferedReader(new FileReader("E:\\Questions.txt"));	//connection to input data file
				String str = "";
				while ((str = br.readLine()) != null) {	//will read line by line till EOF
					System.out.print(str);
					if(str.equals("Q1. Overall Rating of service ?,(Type) Single Select, Options - (1/2/3/4/5)")) {
						question[q++] = str;
						int answer = sc.nextInt();	//temp variable to hold answer
						singleSelectList.add(Integer.toString(answer));	//adding answers into list
						br2.write(answer);	
					}
					if(str.equals("Q2. Area of improvement ? ,(Type) Multi Select,Options - (1.Service Quality/2.Communication/3.Delivery Process)")) {
						question[q++] = str;
						String answer = sc.nextLine();	//temp string to hold answer
						multipleSelectList.add(answer);	//adding answers into list
						br2.write(answer);	//writing to new.txt file
					}
					if(str.equals("Q3. Feedback ? ,(Type)Text,enter")) {
						question[q++] = str;
						String answer = sc.nextLine();	//temp string to hold answer
						br2.write("user"+user +"feedback" +answer);	//writing to new.txt file
					}
					if(str.equals("Q4. Contact No. ? ,(Type) Number, enter")) {
						question[q++] = str;
						String answer = sc.nextLine();	//temp string to hold answer
						br2.write(answer);	//writing to new.txt file
					}
					if(str.equals("Q5. Name ? ,(Type)Text, enter")) {
						question[q++] = str;
						String answer = sc.nextLine();	//temp string to hold answer
						br2.write(answer);	//writing to new.txt file
					}
					br2.newLine();
				}	
			} catch (IOException e) {
				System.out.print("Error");
				e.printStackTrace();
			  }
		}
		br.close();		//closing connections
		br2.close();	//closing connections
		
		Iterator<String> itr=singleSelectList.iterator();  //Iterator to iterate in List
		//putting answers from singleselectlist to array
		while(itr.hasNext()){  
			String str1=itr.next();
			percentage[i++] = Integer.valueOf(str1);
	    } 
		float per[]=new float[5];
		//comparing choices to make statistics
		for(int j=0;j<5;j++) {
			for(i=0;i<user;i++) {
				if(percentage[i]==j+1) {
					num+=1;
					per[j]=num/(float)user*100;
				}	
			}
			num=0;
		}
		//displaying results
		for(int k=0;k<5;k++) {
			System.out.print(+(k+1)+"-"+per[k]+"%"+"\n");
		}
		sc.close();
	}

	@Override
	public int compareTo(Survey o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
