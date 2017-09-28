/** 
 * @author Shivam
 * @version 1.0
 * @Date 29-August-2017
 * @project Data Structure Assignment 6
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

public class UniqueEmployeeCollection {
	static Set<Employee> empSet;
	String result = "", expected = "";
	@BeforeClass
	public static void setup(){
		empSet = new HashSet<Employee>();
		Employee e1 = new Employee("Gaurav", "Sirohi");
		e1.setEmpId(2);
		Employee e2 = new Employee("Rishab", "Jaipur");
		e1.setEmpId(3);
		Employee e3 = new Employee("Nikhil", "Gwalior");
		e1.setEmpId(2);
		Employee e4 = new Employee("Satyam", "Gwalior");
		e1.setEmpId(3);
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
	}

	//Positive Test-Case
	@Test
	public void TestPositive(){
		result = empSet.toString();
		expected = "[\n1  Rishab Jaipur , \n2  Nikhil Gwalior , \n3  Gaurav Sirohi ]";
		assertEquals(expected, result);
	}

	//Negative Test-Case
	@Test
	public void TestNegative(){
		result = empSet.toString();
		expected = "[\n1  Rishab Jaipur , \n2  Nikhil Gwalior ]";
		assertFalse(expected.equals(result));
	}
}
