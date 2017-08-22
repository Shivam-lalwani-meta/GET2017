import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Class MainMenu.
 */
public class MainMenu {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		int choice = 0;
		Reader read = new Reader();
		try {
			read.readDataFromFile();
		} catch (IOException e) {
			System.out.println("Error in reading file");
			e.printStackTrace();
		}
		do {
			if (Organization.getCurrentOrganization() == null
					&& Entity.getCurrentPerson() == null) {
				System.out.println("1.Login");
			}
			System.out.println("2.Add Friend");
			System.out.println("3.Show Network");
			System.out.println("4.Logout");
			System.out.println("0.Exit");
			Entity newUser = new Entity();
			List<Entity> getNames = new ArrayList<Entity>();
			Scanner sc = new Scanner(System.in);

			boolean flag = true;
			do {
				try {
					System.out.print("\n******Enter the choice******");
					choice = Integer.parseInt(sc.next());
					if (choice < 0 || choice > 5) {
						throw new NumberFormatException(
								"\n*Ënter value between 1 and 5");
					}
					flag = false;
				} catch (NumberFormatException e) {
					System.out.println("\n----Ïnvalid choice----");
				}
			} while (flag);

			switch (choice) {
			case 1:
				if (Organization.getCurrentOrganization() == null
						&& Entity.getCurrentPerson() == null) {
					System.out.println("\nEnter Username");
					String userName = sc.next();
					boolean b = Compare.isExist(userName);
					if (b == false) {
						System.out.println("\n----Username doesnt exist----");
					}
				}
				break;

			case 2:
				if (Organization.getCurrentOrganization() == null
						&& Entity.getCurrentPerson() == null) {
					System.out.println("LOGIN FIRST");
					break;
				}
				newUser.display();
				System.out.print("\nEnter Friend Name");
				sc.nextLine();
				String entityName = sc.nextLine();
				if (Compare.isExistName(entityName)) {
					System.out.print("  kvh");
				}
				;
				break;

			case 3:
				if (Organization.getCurrentOrganization() == null
						&& Entity.getCurrentPerson() == null) {
					System.out.println("LOGIN FIRST");
					break;
				}
				Connection.show();
				break;

			case 4:
				Organization.setCurrentOrganization(null);
				Entity.setCurrentPerson(null);
				break;
			}
		} while (choice != 0);
	}
}
