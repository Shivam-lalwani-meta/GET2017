/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 13-September-2017
 * @project JDBC
 * @desc This class in taking Connection variable as input, firing queries and fetching results into variables.
 *
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class Database.
 */
public class Helper {
	
	/** The statment. */
	private Statement stmt;
	
	/** The ResultSet. */
	private ResultSet rs;
	
	/** The result variable to return result string. */
	private String result = "";

	/**
	 * Gets the result query 1.
	 *
	 * @param connection, the connection variable having connection to database
	 * @param query, the query to be fired
	 * @return the result of query 1
	 */
	public void getResultQuery1(Connection connection, String query)  {
		// making object of Title POJO
		Title titleObjList = new Title();
		try {
			stmt = connection.createStatement();	//creating statement
			rs = stmt.executeQuery(query);	//fetching result in result set
			// used to get metadata of the database, like column name, column type, table name, database name
			ResultSetMetaData rsmd = rs.getMetaData();
			//printing metadata
			System.out.println((rsmd.getColumnName(1).toUpperCase()+"    "+rsmd.getColumnName(2).toUpperCase()));
			//traversing resultset and saving to corresponding POJO
			while(rs.next()) {
				titleObjList.getListOfTitle().add(new Title(rs.getString(1), rs.getString(2)));
			}
		} catch(SQLException e) {	//catching SQLException
			System.out.println("Ërror Occur in Query1 " + e.getCause() + e.getMessage());
		}
		//displaying POJO's data
		titleObjList.showTitles();
	}

	/**
	 * Gets the result query 2.
	 *
	 * @param connection, the connection variable having connection to database
	 * @param query, the query to be fired
	 * @return the result of query 2
	 */
	public String getResultQuery2(Connection connection, String query){
		try{
			stmt = connection.createStatement();	//creating statement
			rs = stmt.executeQuery(query);	//fetching result in result set
			//traversing resultset and saving to corresponding variable
			while(rs.next()) {
				result = rs.getString(1);
			}
		} catch(SQLException e) {	//catching SQLException
			System.out.println("Ërror Occur in Query2 " + e.getCause() + e.getMessage());
		}
		//returning result to called function
		return result;
	}

	/**
	 * Gets the result query 3.
	 *
	 * @param connection, the connection variable having connection to database
	 * @param query, the query to be fired
	 * @return the result of query 3
	 */
	public String getResultQuery3(Connection connection, String query) {
		try{
			stmt = connection.createStatement();	//creating statement
			rs = stmt.executeQuery(query);	//returning result to resultset
			//storing result into string
			while(rs.next()) {
				result += rs.getString(1)+ "\n";
			}
		} catch(SQLException e) {	//catching SQLException
			System.out.println("Ërror Occur in Query3 " + e.getCause() + e.getMessage());
		}
		return result;
	}
}