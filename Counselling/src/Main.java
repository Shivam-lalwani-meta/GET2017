/** 
 * @author Shivam
 * @version 1.0
 * @Date 23-August-2017
 * @project Counselling Program
 */

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//initializing college data
		Colleges college1 = new Colleges("IPS", 3, 1);
		Colleges college2 = new Colleges("ITM", 3, 2);
		Colleges college3 = new Colleges("SRITM", 1, 3);
		Colleges college4 = new Colleges("IITM", 3, 4);
		Colleges college5 = new Colleges("RJIT", 1, 5);
		//initializing Student data
		Student s= new Student();
		int choice[] = {1,2,3,4,5};
		s.addStudentDetail(choice,"rajat",1);
		int choice1[] = {1,3,1,4,5};
		s.addStudentDetail(choice1,"gaurav",3);
		int choice2[] = {1,2,1,4,5};
		s.addStudentDetail(choice2,"neel",2);
		int choice3[] = {1,2,3,4,5};
		s.addStudentDetail(choice3,"shivam",5);
		int choice4[] = {1,2,3,5,4};
		s.addStudentDetail(choice4,"satyam",4);

		CounsellingClass cc = new CounsellingClass();
		cc.createCandidateQueue();
		cc.admissionProcedure();
		cc.printResult();
	}

}
