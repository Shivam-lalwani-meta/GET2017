import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestClass {
	static ConnectionToDB controller;
	static Connection connection;
	static Helper database;
	private String result = "", expected;
	
	@BeforeClass
	public static void setup(){
		controller = new ConnectionToDB();
		connection = controller.ConnectToDB();
		database = new Helper();
	}

	@Test
	public void testConnectionEstablishment() {
		assertNotNull(connection);
	}

	@Test
	public void testQuery1(){
		result = database.getResultQuery2(connection, "SELECT IF(COUNT(DISTINCT(b.accession_no)) > 0, "
				+ "'Book can be Issued', 'Book cannot be Issued') as STATUS FROM Titles t LEFT JOIN Books b"
				+ " ON t.title_id = b.title_id WHERE (b.accession_no IN (SELECT DISTINCT(book_issue.accession_no) "
				+ "FROM Book_issue inner JOIn Book_return ON Book_issue.accession_no = Book_return.accession_no) "
				+ "AND t.title_name = 'How I met You')OR (b.accession_no NOT IN (SELECT DISTINCT(accession_no)"
				+ " FROM Book_issue) AND t.title_name = 'How I met You');");
		Assert.assertEquals(result,"Book cannot be Issued");
	}
	
	@Test
	public void testQuery2(){
		result = database.getResultQuery3(connection, "SELECT Books.accession_no FROM Books LEFT JOIN "
						+ "Book_issue ON Books.accession_no = book_issue.accession_no WHERE Book_issue.issue_date IS "
						+ "NULL OR (DATEDIFF(NOW(),Book_issue.issue_date) > 365 AND DATEDIFF(NOW(),Books.purchase_date) > 365)");
		expected = "8005\n8010\n8021\n";
		Assert.assertEquals(result,expected);
	}
}
