import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Reader Class which reads the data from info.txt file and according to its first index value, it creates 
 * the objects of that class..
 */

public class Reader {

	/**
	 * Read data from file.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	//Method to read data from file info.txt

	public void readDataFromFile() throws IOException {
		BufferedReader br = null;	//BufferedReader object
		br = new BufferedReader(new FileReader("E:\\info.txt"));
		String ls = "";	//empty string to hold temporary line
		try {
			//condition to check the encounter of EOF
			while((ls = br.readLine())!=null) {
				String[] tempLine = ls.split(";");	//spliting the attributes by ; and assign the splitted attributes to string array
				//condition to check whether the data is of Person or not
				if(tempLine[0].equals("Person")) {
					Entity.getListOfPersons().add(Entity.createPerson(tempLine));
				}
				//condition to check whether the data is of Organization or not
				if(tempLine[0].equals("Organization")) {
					Organization.getListOfOrganization().add(Organization.createOrganization(tempLine));
				}

			}
		} catch (IOException e) {
			System.out.println("Error in Reading file");
			e.printStackTrace();
		}
		br.close();	//closing BufferedReader object
	}


}
