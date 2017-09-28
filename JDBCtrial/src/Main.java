/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 13-September-2017
 * @project JDBC
 *
 */
import java.sql.Connection;
import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ConnectionToDB controller = new ConnectionToDB();	//creating ConnectionToDB class object 
		Helper database = new Helper();	//creating Database class object 
		Connection connection = controller.ConnectToDB();	//creating Connection class object 
		String authorName, bookName;
		int choice;
		Scanner scan = new Scanner(System.in);
		while(true) {
			Validation.printMenu();	//printing menu
			choice = Validation.takeIntegerAsInput();	//validated input

			switch(choice) {
			case 1:
				System.out.println("\nEnter Author Name");
				authorName = Validation.takeStringAsInput();	//validated input
				//displaying result of query via database class methods
				database.getResultQuery1(connection, "SELECT a.author_name, t.title_name from Publishers p JOIN Titles"
						+ " t ON p.publisher_id = t.publisher_id JOIN Title_author ta ON t.title_id = "
						+ "ta.title_id JOIN Authors a ON a.author_id = ta.author_id WHERE a.author_name ="+"'"+authorName+"'"+";");
				break;

			case 2:
				System.out.println("\nEnter Book Name");
				bookName = Validation.takeStringAsInput();	//validated input
				//displaying result of query via database class methods
				System.out.println(database.getResultQuery2(connection, "SELECT IF(COUNT(DISTINCT(b.accession_no)) > 0, "
						+ "'Book can be Issued', 'Book cannot be Issued') as STATUS FROM Titles t LEFT JOIN Books b"
						+ " ON t.title_id = b.title_id WHERE (b.accession_no IN (SELECT DISTINCT(book_issue.accession_no) "
						+ "FROM Book_issue inner JOIn Book_return ON Book_issue.accession_no = Book_return.accession_no) "
						+ "AND t.title_name ="+"'"+bookName+"'"+")OR (b.accession_no NOT IN (SELECT DISTINCT(accession_no)"
								+ " FROM Book_issue) AND t.title_name = "+"'"+bookName+"'"+");"));
				break;

			case 3:
				//displaying result of query via database class methods
				System.out.println(database.getResultQuery3(connection, "SELECT Books.accession_no FROM Books LEFT JOIN "
						+ "Book_issue ON Books.accession_no = book_issue.accession_no WHERE Book_issue.issue_date IS "
						+ "NULL OR (DATEDIFF(NOW(),Book_issue.issue_date) > 365 AND DATEDIFF(NOW(),Books.purchase_date) > 365)"));
				break;

			case 4:
				System.out.println("\nThankYou");
				System.exit(0);
				scan.close();	//closing scanner class object

			default:
				System.out.println("Please Enter a valid option");
			}
		}
	}
}
