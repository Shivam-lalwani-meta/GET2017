/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 13-September-2017
 * @project JDBC
 * @desc This class is made to Establish connection with the database.
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * The Class Controller.
 */
public class ConnectionToDB {  
	
	/**
	 * Connect to DB.
	 *
	 * @return the connection
	 */
	public Connection ConnectToDB() {
		try {
			//registering Driver
			Class.forName(Constants.driver);
		} catch (ClassNotFoundException e) {	//catching ClassNotFoundException
			System.out.println("Error in Connection");
			e.printStackTrace();
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			//connecting to MYSQL
			connection = DriverManager
					.getConnection(Constants.mysqlURL,Constants.userId, Constants.password);
		} catch (SQLException s) {	//catching SQLException
			System.out.println("Connection Failed!");
			s.printStackTrace();
		}
		//returning Connection variable
		return connection;
	}
}

