/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 13-September-2017
 * @project JDBC
 *
 */
import java.util.ArrayList;
import java.util.List;

/**
 * The Class Title.
 */
public class Title {

	/** The title name. */
	private String titleName;
	
	/** The author name. */
	private String authorName;
	
	/** The list of title. */
	private static List<Title> listOfTitle ;
	
	/**
	 * Gets the title name.
	 *
	 * @return the title name
	 */
	public String getTitleName() {
		return titleName;
	}
	
	/**
	 * Sets the title name.
	 *
	 * @param titleName the new title name
	 */
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	/**
	 * Gets the author name.
	 *
	 * @return the author name
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * Sets the author name.
	 *
	 * @param authorName the new author name
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * Gets the list of title.
	 *
	 * @return the list of title
	 */
	public List<Title> getListOfTitle() {
		return listOfTitle;
	}

	/**
	 * Instantiates a new title.
	 */
	public Title() {
		listOfTitle = new ArrayList<Title>();
	}
	
	/**
	 * Instantiates a new title.
	 *
	 * @param authorName, the author name
	 * @param titleName, the title name
	 */
	public Title(String authorName, String titleName) {
		this.authorName = authorName;
		this.titleName = titleName;
	}

	/**
	 * Displaying Title objects.
	 */
	public void showTitles() {
		for(Title t : listOfTitle) {
			System.out.println(t.authorName + "   " + t.titleName);
		}
		System.out.println("---------------End-------------");
	}
}
