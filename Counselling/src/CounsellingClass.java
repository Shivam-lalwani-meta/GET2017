/** 
 * @author Shivam
 * @version 1.0
 * @Date 23-August-2017
 * @project Counselling Program
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The Class CounsellingClass.
 */
public class CounsellingClass {
	
	/** The candidate queue. */
	QueueClass candidateQueue;
	
	/** The colleges. */
	int colleges[];
	
	/** The rank. */
	int rank[];
	
	/** The student objects. */
	Student studentObjects;
	
	/** The col. */
	Colleges col = new Colleges();
	
	/** The colg. */
	public static Map<Integer,Colleges> colg = new HashMap<>();
	
	/** The student. */
	public Map<Integer,Student> student;
	
	/** The result map. */
	public Map<String,Student> resultMap = new HashMap<>();
	
	/** The clg id. */
	int clgId[];
	
	/**
	 * Instantiates a new counselling class and initialize candidateQueue, colleges array,studentObjects
	 * rank array, col object.
	 */
	public CounsellingClass() {
		candidateQueue = new QueueClass();
		colleges = new int[5];
		studentObjects = new Student();
		student = studentObjects.getDetails();
		rank = new int[student.size()];
	}
	
	/**
	 * This method fetches the student list as a keyset and sort the rank and set that in 
	 * rank array and then dequeue it in candidateQueue
	 */
	public void createCandidateQueue() {
		int i=0;
		Set<Integer> ranks = student.keySet();
		for(Integer id :ranks) {
			rank[i] = student.get(id).getRank();
			i++;
		}
		Arrays.sort(rank);
		for(int j=0;j<rank.length;j++) {
			candidateQueue.enqueue(student.get(rank[j]));
		}
	}

	/**
	 * Admission procedure calls getAdmission
	 */
	public void admissionProcedure() {
		for(int i=0;i<rank.length ;i++) {
			getAdmission();
		}
	}

	/**
	 * This method dequeue each Student object and checks its choice queue and based on that
	 * checks the availability of that college.
	 * Now, it iterate till the Seat is not allocated to Student
	 * And lastly dequeue the alloted Student fom the queue and deducting number of seats of that 
	 * particular college.
	 */
	private void getAdmission() {
		colg = col.getCollegeDetail();	//fetching college List
		Object ss =  candidateQueue.getFront();	//fetching first Student according to rank
		//getting the choice of partcular student in trmporary array
		int choiceArray[] = ((Student) ss).getChoice();
		
		for(int i = 0; i < rank.length; i++) {
			int collegeChoice = choiceArray[i];	//fetching choice till clg is not allocated
			Colleges cl = colg.get(collegeChoice);	//fetching priored college
			//checking seats of that college
			if(cl.seats!=0) {
				//adding the final list in resultMap
				resultMap.put(cl.getName() +","+((Student)ss).getName() , (Student) ss);
				candidateQueue.dequeue();	//dequeue the alloted student from queue
				cl.seats--;	//deducting seat
				break;
			}
		}
	}
	
	/**
	 * Prints the result.
	 */
	public void printResult() {
		//printing the result Hashmap
		Set<String> result = resultMap.keySet();
		for(String id :result) {
			String[] collegeId = id.split(",");
			System.out.println("Result is :" + "college name = "+collegeId[0]
					+ "   Name ="+resultMap.get(id).getName());
		}
		candidateQueue.printQueue();	//printing students not got allocated after counselling
	}
}

